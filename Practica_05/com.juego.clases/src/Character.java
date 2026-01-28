import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Representa a un personaje en el juego, ya sea el jugador o un enemigo.
 * Contiene todos los atributos de combate (vida, maná, etc.), su rol, su raza
 * y gestiona los estados que le afectan.
 */
public class Character {
    // --- ATRIBUTOS ---
    private final String name;              // El nombre del personaje.
    private final Role role;                // El rol que define sus estadísticas y habilidades base.
    private final Race race;                // La raza del personaje.

    private int health;                     // La vida actual del personaje.
    private int mana;                       // El maná actual.
    private final int attack;               // El poder de ataque base.
    private final int defense;              // La capacidad de defensa para reducir el daño.
    private final List<BaseStates> activeStates = new ArrayList<>(); // Lista de estados que están afectando al personaje.
    private boolean isParalyzed = false;    // Indica si el personaje está paralizado en el turno actual.

    /**
     * Constructor para crear un nuevo personaje.
     * @param name El nombre del personaje.
     * @param role El rol asignado.
     * @param race La raza asignada.
     */
    public Character(String name, Role role, Race race) {
        this.name = name;
        this.role = role;
        this.race = race;

        // Las estadísticas iniciales se heredan del rol.
        this.health = role.getHealth();
        this.mana = role.getMana();
        this.attack = role.getAttack();
        this.defense = role.getDefense();
    }

    // --- GETTERS ---
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getAttack() { return attack; }
    public Role getRole() { return role; }
    public Race getRace() { return race; }
    public boolean isParalyzed() { return isParalyzed; }

    /**
     * Aplica daño al personaje, teniendo en cuenta su defensa.
     * @param damage El daño bruto del ataque.
     * @return El daño final infligido después de la reducción por defensa.
     */
    public int takeDamage(int damage) {
        int finalDamage = damage - this.defense;
        if (finalDamage < 1) {
            finalDamage = 1; // Se asegura de que al menos se haga 1 punto de daño.
        }
        this.health -= finalDamage;
        if (this.health < 0) {
            this.health = 0; // La vida nunca puede ser negativa.
        }
        return finalDamage;
    }

    /**
     * Añade un nuevo estado a la lista de estados activos del personaje.
     * @param stateToApply El estado que se va a aplicar.
     */
    public void applyState(StatesToApply stateToApply) {
        BaseStates newState = new BaseStates(stateToApply.getName(), stateToApply.getTurnsDamageDuration(), stateToApply.getTurnDamage(), stateToApply.getTurnWithoutAttack());
        activeStates.add(newState);
        System.out.println("¡" + name + " ahora está " + stateToApply.getName() + "!");
    }

    /**
     * Procesa todos los estados activos al inicio del turno del personaje.
     * Aplica daño por turno, gestiona la parálisis y reduce la duración de los estados.
     */
    public void processStates() {
        this.isParalyzed = false;
        Iterator<BaseStates> iterator = activeStates.iterator();

        while (iterator.hasNext()) {
            BaseStates state = iterator.next();
            // Aplica daño si el estado lo requiere.
            if (state.getTurnDamage() > 0) {
                this.health -= state.getTurnDamage();
                System.out.println(name + " sufre " + state.getTurnDamage() + " de daño por " + state.getName() + ".");
            }
            // Comprueba si el estado causa parálisis.
            if (state.getTurnWithoutAttack() > 0) {
                this.isParalyzed = true;
            }

            // Reduce la duración del estado y lo elimina si ha expirado.
            state.setTurnsDamageDuration(state.getTurnsDamageDuration() - 1);
            if (state.getTurnsDamageDuration() <= 0) {
                System.out.println("El efecto '" + state.getName() + "' ha desaparecido de " + name + ".");
                iterator.remove();
            }
        }
        if (this.health < 0) this.health = 0;
    }
    
    /**
     * Reduce el maná del personaje cuando usa una habilidad.
     * @param manaCost La cantidad de maná a consumir.
     */
    public void consumeMana(int manaCost) {
        this.mana -= manaCost;
    }
}
