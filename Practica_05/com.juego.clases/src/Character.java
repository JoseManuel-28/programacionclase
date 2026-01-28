import java.util.ArrayList;
import java.util.List;

public class Character {
    public String name;
    public int age;
    public Role role;
    public Race race;
    public Sex sex;

    public int health;
    public int mana;
    public int attack;
    public int defense;
    public List<States> activeStates = new ArrayList<>();
    public boolean isParalyzed = false;

    public Character(String name, int age, Sex sex, Role role, Race race) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.role = role;
        this.race = race;

        this.health = role.health;
        this.mana = role.mana;
        this.attack = role.attack;
        this.defense = role.defense;
    }

    public int takeDamage(int damage) {
        int finalDamage = damage - defense;
        if (finalDamage < 1) {
            finalDamage = 1; // Asegura que siempre se haga al menos 1 de daño
        }
        this.health -= finalDamage;
        if (this.health < 0) {
            this.health = 0;
        }
        return finalDamage;
    }

    public void applyState(StatesToApply stateToApply) {
        // Aquí podrías añadir una lógica de probabilidad si quieres
        States newState = new States(stateToApply.name, stateToApply.turnsDamageDuration, stateToApply.turnDamage, stateToApply.turnWithoutAttack);
        activeStates.add(newState);
        System.out.println("¡" + name + " ahora está " + stateToApply.name + "!");
    }

    public void processStates() {
        isParalyzed = false;
        List<States> statesToRemove = new ArrayList<>();

        for (States state : activeStates) {
            if (state.turnDamage > 0) {
                this.health -= state.turnDamage;
                System.out.println(name + " sufre " + state.turnDamage + " de daño por " + state.name + ".");
            }
            if (state.turnWithoutAttack > 0) {
                isParalyzed = true;
            }

            state.turnsDamageDuration--;
            if (state.turnsDamageDuration <= 0) {
                statesToRemove.add(state);
            }
        }

        for (States state : statesToRemove) {
            activeStates.remove(state);
            System.out.println("El efecto '" + state.name + "' ha desaparecido de " + name + ".");
        }
    }
}
