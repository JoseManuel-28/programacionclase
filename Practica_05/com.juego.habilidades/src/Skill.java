import java.util.ArrayList;

/**
 * Representa una habilidad que un personaje puede usar en combate.
 * Cada habilidad tiene un efecto principal (como hacer daño) y puede tener efectos secundarios,
 * como aplicar estados (veneno, parálisis, etc.).
 */
public class Skill {
    // --- ATRIBUTOS ---
    private final String name;                      // El nombre de la habilidad (ej. "Bola de Fuego").
    private final int damage;                       // El daño base que causa la habilidad.
    private final int consumptionMana;              // Cuánto maná cuesta usarla.
    private final int defenseIncrease;              // Si la habilidad mejora la defensa, este es el valor.
    private final int healthIncrease;               // Si la habilidad cura, este es el valor.
    private int uses;                               // Cuántas veces se puede usar la habilidad en un combate.
    private final ArrayList<StatesToApply> statesToApply; // La lista de estados que esta habilidad puede intentar aplicar.

    /**
     * Constructor para crear una nueva habilidad.
     * @param name El nombre de la habilidad.
     * @param damage El daño que inflige.
     * @param consumptionMana El coste de maná.
     * @param defenseIncrease El bonus de defensa que otorga.
     * @param healthIncrease La cantidad de vida que restaura.
     * @param dodgeTurn Cuántos turnos permite esquivar (no implementado).
     * @param uses El número de usos por combate.
     * @param statesToApply La lista de estados que puede aplicar.
     */
    public Skill(String name, int damage, int consumptionMana, int defenseIncrease, int healthIncrease, int dodgeTurn, int uses, ArrayList<StatesToApply> statesToApply) {
        this.name = name;
        this.damage = damage;
        this.consumptionMana = consumptionMana;
        this.defenseIncrease = defenseIncrease;
        this.healthIncrease = healthIncrease;
        this.uses = uses;
        this.statesToApply = statesToApply;
    }

    // --- GETTERS ---
    public String getName() { return name; }
    public int getDamage() { return damage; }
    public int getConsumptionMana() { return consumptionMana; }
    public int getUses() { return uses; }
    public ArrayList<StatesToApply> getStatesToApply() { return statesToApply; }

    /**
     * Reduce en uno el contador de usos de la habilidad.
     * Se llama cada vez que la habilidad se usa con éxito.
     */
    public void use() {
        if (this.uses > 0) {
            this.uses--;
        }
    }
}
