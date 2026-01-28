import java.util.Random;
import java.util.Scanner;

public class GameController {

    private static final int CRITICAL_CHANCE = 15; // Probabilidad de crítico (en porcentaje)
    private Random random = new Random();

    public void startCombat(Character player, Character enemy) {
        System.out.println("\n=============================================");
        System.out.println("          ¡COMIENZA EL COMBATE!");
        System.out.println("=============================================");
        System.out.println(player.name + " vs " + enemy.name);
        System.out.println("=============================================\n");

        while (player.health > 0 && enemy.health > 0) {
            // Turno del jugador
            System.out.println(">>> TURNO DE " + player.name + " <<<");
            player.processStates();
            if (player.health <= 0) {
                System.out.println("¡" + player.name + " ha caído por los efectos de un estado!");
                break;
            }

            if (!player.isParalyzed) {
                playerTurn(player, enemy);
            } else {
                System.out.println("¡" + player.name + " está paralizado y no puede moverse!");
            }
            
            if (enemy.health <= 0) {
                System.out.println("\n---------------------------------------------");
                System.out.println("¡" + enemy.name + " ha sido derrotado!");
                System.out.println("¡HAS GANADO EL COMBATE, " + player.name + "!");
                System.out.println("---------------------------------------------\n");
                break;
            }

            // Turno del enemigo
            System.out.println(">>> TURNO DE " + enemy.name + " <<<");
            enemy.processStates();
            if (enemy.health <= 0) {
                System.out.println("¡" + enemy.name + " ha caído por los efectos de un estado!");
                break;
            }

            if (!enemy.isParalyzed) {
                enemyTurn(enemy, player);
            } else {
                System.out.println("¡" + enemy.name + " está paralizado y no puede moverse!");
            }

            if (player.health <= 0) {
                System.out.println("\n---------------------------------------------");
                System.out.println("¡" + player.name + " ha sido derrotado!");
                System.out.println("¡HAS PERDIDO EL COMBATE!");
                System.out.println("---------------------------------------------\n");
                break;
            }
        }
    }

    private void showStatus(Character player, Character enemy) {
        System.out.println("--- ESTADO DEL COMBATE ---");
        System.out.println(player.name + " - Vida: " + player.health + " | Maná: " + player.mana);
        System.out.println(enemy.name + " - Vida: " + enemy.health);
        System.out.println("--------------------------\n");
    }

    private void playerTurn(Character player, Character enemy) {
        showStatus(player, enemy);

        System.out.println("Elige una acción:");
        System.out.println("  1. Atacar");
        System.out.println("  2. Usar habilidad");
        System.out.print("Tu elección: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                attack(player, enemy);
                break;
            case 2:
                useSkill(player, enemy);
                break;
            default:
                System.out.println("¡Opción no válida! Pierdes el turno.");
                break;
        }
        System.out.println("---------------------------------------------\n");
    }

    private void attack(Character attacker, Character defender) {
        int damageDealt = calculateAttackDamage(attacker.attack);
        boolean isCritical = random.nextInt(100) < CRITICAL_CHANCE;

        if (isCritical) {
            damageDealt *= 2;
            System.out.println("¡GOLPE CRÍTICO!");
        }

        int finalDamage = defender.takeDamage(damageDealt);
        System.out.println("¡" + attacker.name + " ataca a " + defender.name + " y le inflige " + finalDamage + " puntos de daño!");
    }

    private int calculateAttackDamage(int baseAttack) {
        // El daño varía entre el 80% y el 120% del ataque base
        int minDamage = (int) (baseAttack * 0.8);
        int maxDamage = (int) (baseAttack * 1.2);
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    private void useSkill(Character player, Character enemy) {
        System.out.println("Elige una habilidad para usar:");
        for (int i = 0; i < player.role.skills.length; i++) {
            Skill skill = player.role.skills[i];
            if (skill != null) {
                 System.out.println("  " + (i + 1) + ". " + skill.name + " (Coste: " + skill.consumptionMana + " Maná, Usos: " + skill.uses + ")");
            }
        }
        System.out.print("Tu elección: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt() - 1;
        System.out.println();

        if (choice >= 0 && choice < player.role.skills.length && player.role.skills[choice] != null) {
            Skill skill = player.role.skills[choice];
            if (skill.uses > 0) {
                if (player.mana >= skill.consumptionMana) {
                    player.mana -= skill.consumptionMana;
                    skill.uses--;
                    int finalDamage = enemy.takeDamage(skill.damage);
                    System.out.println("¡Usas '" + skill.name + "'! Infliges " + finalDamage + " de daño a " + enemy.name + ".");
                    
                    // Aplicar estados si la habilidad los tiene
                    if (skill.statesToApply != null) {
                        for (StatesToApply state : skill.statesToApply) {
                            // Aquí usamos la probabilidad definida en el estado
                            if (random.nextInt(100) < state.probabilityApplying) {
                                enemy.applyState(state);
                            }
                        }
                    }
                } else {
                    System.out.println("¡No tienes suficiente maná para usar '" + skill.name + "'!");
                }
            } else {
                System.out.println("¡No te quedan usos de '" + skill.name + "'!");
            }
        } else {
            System.out.println("¡Habilidad no válida! Pierdes el turno.");
        }
    }

    private void enemyTurn(Character enemy, Character player) {
        attack(enemy, player);
        System.out.println("---------------------------------------------\n");
    }
}
