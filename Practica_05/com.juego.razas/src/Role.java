import java.util.ArrayList;

/**
 * Representa el rol o la clase de un personaje (ej. Caballero, Mago, Arquero).
 * El rol define las estadísticas base del personaje (vida, ataque, defensa, maná)
 * y el conjunto de habilidades que puede usar.
 */
public class Role {
    // --- ATRIBUTOS ---
    private final String name;          // El nombre del rol.
    private final int health;           // La vida base del rol.
    private final int defense;          // La defensa base.
    private final int mana;             // El maná base.
    private final int attack;           // El ataque base.
    private final Skill[] skills;       // El array de habilidades que este rol puede usar.
    private final ArrayList<BaseStates> states; // Lista de estados iniciales (no se usa actualmente).

    /**
     * Constructor para crear un nuevo rol.
     * @param name El nombre del rol.
     * @param health La vida inicial.
     * @param defense La defensa inicial.
     * @param mana El maná inicial.
     * @param attack El ataque inicial.
     * @param skills Las habilidades asociadas a este rol.
     * @param states Los estados iniciales (actualmente no se usa).
     */
    public Role(String name, int health, int defense, int mana, int attack, Skill[] skills, ArrayList<BaseStates> states) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.mana = mana;
        this.attack = attack;
        this.skills = skills;
        this.states = states;
    }

    // --- GETTERS ---
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDefense() { return defense; }
    public int getMana() { return mana; }
    public int getAttack() { return attack; }
    public Skill[] getSkills() { return skills; }
}
