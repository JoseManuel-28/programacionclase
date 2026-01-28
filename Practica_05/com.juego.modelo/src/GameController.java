import java.util.Random;
import java.util.Scanner;

/**
 * Gestiona la lógica del combate por turnos entre dos personajes.
 * Es el motor que controla el flujo de la batalla, las acciones de los jugadores y la IA del enemigo.
 */
public class GameController {

    private static final int CRITICAL_CHANCE = 15; // Probabilidad de crítico (en porcentaje).
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Inicia y gestiona un combate hasta que uno de los dos personajes es derrotado.
     * @param player El personaje del jugador.
     * @param enemy El personaje enemigo.
     */
    public void startCombat(Character player, Character enemy) {
        System.out.println("\n=============================================");
        System.out.println("          ¡COMIENZA EL COMBATE!");
        System.out.println("=============================================");
        System.out.println(player.getName() + " vs " + enemy.getName());
        System.out.println("=============================================\n");

        // El bucle principal del combate: continúa mientras ambos personajes tengan vida.
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            // --- Turno del Jugador ---
            System.out.println(">>> TURNO DE " + player.getName() + " <<<");
            player.processStates(); // Procesa venenos, parálisis, etc.
            if (player.getHealth() <= 0) {
                System.out.println("¡" + player.getName() + " ha caído por los efectos de un estado!");
                break;
            }

            if (!player.isParalyzed()) {
                playerTurn(player, enemy);
            } else {
                System.out.println("¡" + player.getName() + " está paralizado y no puede moverse!");
            }
            
            if (enemy.getHealth() <= 0) {
                System.out.println("\n---------------------------------------------");
                System.out.println("¡" + enemy.getName() + " ha sido derrotado!");
                System.out.println("¡HAS GANADO EL COMBATE, " + player.getName() + "!");
                System.out.println("---------------------------------------------\n");
                break;
            }

            // --- Turno del Enemigo ---
            System.out.println(">>> TURNO DE " + enemy.getName() + " <<<");
            enemy.processStates();
            if (enemy.getHealth() <= 0) {
                System.out.println("¡" + enemy.getName() + " ha caído por los efectos de un estado!");
                break;
            }

            if (!enemy.isParalyzed()) {
                enemyTurn(enemy, player);
            } else {
                System.out.println("¡" + enemy.getName() + " está paralizado y no puede moverse!");
            }

            if (player.getHealth() <= 0) {
                System.out.println("\n---------------------------------------------");
                System.out.println("¡" + player.getName() + " ha sido derrotado!");
                System.out.println("¡HAS PERDIDO EL COMBATE!");
                System.out.println("---------------------------------------------\n");
                break;
            }
        }
    }

    /**
     * Muestra el estado actual de ambos combatientes (vida y maná).
     */
    private void showStatus(Character player, Character enemy) {
        System.out.println("--- ESTADO DEL COMBATE ---");
        System.out.println(player.getName() + " - Vida: " + player.getHealth() + " | Maná: " + player.getMana());
        System.out.println(enemy.getName() + " - Vida: " + enemy.getHealth());
        System.out.println("--------------------------\n");
    }

    /**
     * Gestiona las acciones que el jugador puede realizar en su turno.
     */
    private void playerTurn(Character player, Character enemy) {
        showStatus(player, enemy);

        System.out.println("Elige una acción:");
        System.out.println("  1. Atacar");
        System.out.println("  2. Usar habilidad");
        System.out.print("Tu elección: ");

        int choice = -1;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            scanner.next(); // Limpia la entrada inválida.
        }
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

    /**
     * Realiza un ataque básico de un personaje a otro.
     * Calcula el daño, comprueba si es un golpe crítico y aplica el daño final.
     */
    private void attack(Character attacker, Character defender) {
        int damageDealt = calculateAttackDamage(attacker.getAttack());
        boolean isCritical = random.nextInt(100) < CRITICAL_CHANCE;

        if (isCritical) {
            damageDealt *= 2; // El daño se duplica en un golpe crítico.
            System.out.println("¡GOLPE CRÍTICO!");
        }

        int finalDamage = defender.takeDamage(damageDealt);
        System.out.println("¡" + attacker.getName() + " ataca a " + defender.getName() + " y le inflige " + finalDamage + " puntos de daño!");
    }

    /**
     * Calcula el daño de un ataque básico, introduciendo una pequeña variación aleatoria.
     * @param baseAttack El ataque base del personaje.
     * @return El daño final calculado.
     */
    private int calculateAttackDamage(int baseAttack) {
        // El daño puede variar entre un 80% y un 120% del ataque base.
        int minDamage = (int) (baseAttack * 0.8);
        int maxDamage = (int) (baseAttack * 1.2);
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    /**
     * Gestiona el uso de una habilidad por parte del jugador.
     * Muestra las habilidades disponibles y procesa la selección.
     */
    private void useSkill(Character player, Character enemy) {
        System.out.println("Elige una habilidad para usar:");
        Skill[] skills = player.getRole().getSkills();
        for (int i = 0; i < skills.length; i++) {
            Skill skill = skills[i];
            if (skill != null) {
                 System.out.println("  " + (i + 1) + ". " + skill.getName() + " (Coste: " + skill.getConsumptionMana() + " Maná, Usos: " + skill.getUses() + ")");
            }
        }
        System.out.print("Tu elección: ");

        int choice = -1;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt() - 1;
        } else {
            scanner.next();
        }
        System.out.println();

        if (choice >= 0 && choice < skills.length && skills[choice] != null) {
            Skill skill = skills[choice];
            if (skill.getUses() > 0) {
                if (player.getMana() >= skill.getConsumptionMana()) {
                    player.consumeMana(skill.getConsumptionMana());
                    skill.use();
                    int finalDamage = enemy.takeDamage(skill.getDamage());
                    System.out.println("¡Usas '" + skill.getName() + "'! Infliges " + finalDamage + " de daño a " + enemy.getName() + ".");
                    
                    // Aplica los estados de la habilidad si los tiene.
                    if (skill.getStatesToApply() != null) {
                        for (StatesToApply state : skill.getStatesToApply()) {
                            if (random.nextInt(100) < state.getProbabilityApplying()) {
                                enemy.applyState(state);
                            }
                        }
                    }
                } else {
                    System.out.println("¡No tienes suficiente maná para usar '" + skill.getName() + "'!");
                }
            } else {
                System.out.println("¡No te quedan usos de '" + skill.getName() + "'!");
            }
        } else {
            System.out.println("¡Habilidad no válida! Pierdes el turno.");
        }
    }

    /**
     * Controla la lógica del turno del enemigo (IA).
     * El enemigo tiene una probabilidad de usar una habilidad o de realizar un ataque básico.
     */
    private void enemyTurn(Character enemy, Character player) {
        boolean usedSkill = false;
        // 30% de probabilidad de intentar usar una habilidad.
        if (random.nextInt(100) < 30) {
            Skill[] skills = enemy.getRole().getSkills();
            for (Skill skill : skills) {
                // Comprueba si la habilidad es usable (usos y maná disponibles).
                if (skill != null && skill.getUses() > 0 && enemy.getMana() >= skill.getConsumptionMana()) {
                    enemy.consumeMana(skill.getConsumptionMana());
                    skill.use();
                    int finalDamage = player.takeDamage(skill.getDamage());
                    System.out.println("¡" + enemy.getName() + " usa '" + skill.getName() + "'! Te inflige " + finalDamage + " de daño.");
                    
                    if (skill.getStatesToApply() != null) {
                        for (StatesToApply state : skill.getStatesToApply()) {
                            if (random.nextInt(100) < state.getProbabilityApplying()) {
                                player.applyState(state);
                            }
                        }
                    }
                    usedSkill = true;
                    break; // El enemigo usa solo una habilidad por turno.
                }
            }
        }

        // Si no usó una habilidad (ya sea por probabilidad o por falta de recursos), ataca.
        if (!usedSkill) {
            attack(enemy, player);
        }
        System.out.println("---------------------------------------------\n");
    }
}
