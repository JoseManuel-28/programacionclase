import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Character {
    private final String name;
    private final Role role;
    private final Race race;

    private int health;
    private int mana;
    private final int attack;
    private final int defense;
    private final List<BaseStates> activeStates = new ArrayList<>();
    private boolean isParalyzed = false;

    public Character(String name, Role role, Race race) {
        this.name = name;
        this.role = role;
        this.race = race;

        this.health = role.getHealth();
        this.mana = role.getMana();
        this.attack = role.getAttack();
        this.defense = role.getDefense();
    }

    // Getters
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getAttack() { return attack; }
    public Role getRole() { return role; }
    public Race getRace() { return race; }
    public boolean isParalyzed() { return isParalyzed; }

    public int takeDamage(int damage) {
        int finalDamage = damage - this.defense;
        if (finalDamage < 1) {
            finalDamage = 1;
        }
        this.health -= finalDamage;
        if (this.health < 0) {
            this.health = 0;
        }
        return finalDamage;
    }

    public void applyState(StatesToApply stateToApply) {
        BaseStates newState = new BaseStates(stateToApply.getName(), stateToApply.getTurnsDamageDuration(), stateToApply.getTurnDamage(), stateToApply.getTurnWithoutAttack());
        activeStates.add(newState);
        System.out.println("¡" + name + " ahora está " + stateToApply.getName() + "!");
    }

    public void processStates() {
        this.isParalyzed = false;
        Iterator<BaseStates> iterator = activeStates.iterator();

        while (iterator.hasNext()) {
            BaseStates state = iterator.next();
            if (state.getTurnDamage() > 0) {
                this.health -= state.getTurnDamage();
                System.out.println(name + " sufre " + state.getTurnDamage() + " de daño por " + state.getName() + ".");
            }
            if (state.getTurnWithoutAttack() > 0) {
                this.isParalyzed = true;
            }

            state.setTurnsDamageDuration(state.getTurnsDamageDuration() - 1);
            if (state.getTurnsDamageDuration() <= 0) {
                System.out.println("El efecto '" + state.getName() + "' ha desaparecido de " + name + ".");
                iterator.remove();
            }
        }
        if (this.health < 0) this.health = 0;
    }
    
    public void consumeMana(int manaCost) {
        this.mana -= manaCost;
    }
}
