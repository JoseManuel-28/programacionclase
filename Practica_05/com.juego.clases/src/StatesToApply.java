/**
 * Representa un estado que una habilidad puede intentar aplicar a un personaje.
 * Hereda de `BaseStates`, añadiendo una probabilidad de que el estado se aplique con éxito.
 * Por ejemplo, una "Bola de Fuego" podría tener un 80% de probabilidad de aplicar el estado "Quemado".
 */
public class StatesToApply extends BaseStates {
    // --- ATRIBUTOS ---
    private final int probabilityApplying; // La probabilidad (en porcentaje) de que este estado se aplique.

    /**
     * Constructor para crear un estado aplicable.
     * @param name El nombre del estado.
     * @param probabilityApplying La probabilidad (de 0 a 100) de que se aplique.
     * @param turnsDamageDuration La duración del estado en turnos.
     * @param turnDamage El daño que inflige por turno.
     * @param turnWithoutAttack Los turnos que paraliza.
     */
    public StatesToApply(String name, int probabilityApplying, int turnsDamageDuration, int turnDamage, int turnWithoutAttack) {
        super(name, turnsDamageDuration, turnDamage, turnWithoutAttack);
        this.probabilityApplying = probabilityApplying;
    }

    // --- GETTERS ---
    /**
     * Devuelve la probabilidad de que este estado se aplique.
     * @return Un número entre 0 y 100.
     */
    public int getProbabilityApplying() {
        return probabilityApplying;
    }
}
