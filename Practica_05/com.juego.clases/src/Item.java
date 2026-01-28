/**
 * Representa un objeto que un personaje puede tener en su inventario.
 * De momento, los objetos no se pueden usar, pero la estructura está lista para cuando se implemente.
 * Cada objeto tiene un nombre y define cuánto aumenta la vida, el maná, el ataque o la defensa.
 */
public class Item {
    // --- ATRIBUTOS ---
    private final String name;              // El nombre del objeto (ej. "Poción de Vida").
    private final int healthIncrease;       // Cuánto cura o aumenta la vida máxima.
    private final int attackIncrease;       // Cuánto aumenta el ataque.
    private final int manaIncrease;         // Cuánto restaura o aumenta el maná máximo.
    private final int defenseIncrease;      // Cuánto aumenta la defensa.

    /**
     * Constructor para crear un nuevo objeto.
     * @param name El nombre que se mostrará.
     * @param healthIncrease El valor de curación.
     * @param attackIncrease El bonus de ataque.
     * @param manaIncrease El valor de restauración de maná.
     * @param defenseIncrease El bonus de defensa.
     */
    public Item(String name, int healthIncrease, int attackIncrease, int manaIncrease, int defenseIncrease) {
        this.name = name;
        this.healthIncrease = healthIncrease;
        this.attackIncrease = attackIncrease;
        this.manaIncrease = manaIncrease;
        this.defenseIncrease = defenseIncrease;
    }

    // --- GETTERS (para poder consultar las propiedades del objeto) ---
    public String getName() { return name; }
    public int getHealthIncrease() { return healthIncrease; }
    public int getAttackIncrease() { return attackIncrease; }
    public int getManaIncrease() { return manaIncrease; }
    public int getDefenseIncrease() { return defenseIncrease; }
}
