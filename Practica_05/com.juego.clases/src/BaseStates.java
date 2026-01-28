/**
 * Representa la plantilla base para cualquier estado que pueda afectar a un personaje (ej. veneno, parálisis).
 * Contiene la información esencial de un estado, como su duración y los efectos que provoca.
 */
public class BaseStates {
    // --- ATRIBUTOS ---
    private final String name;                // El nombre del estado, para poder identificarlo (ej. "Quemado").
    private int turnsDamageDuration;    // Cuántos turnos le quedan al estado antes de desaparecer.
    private final int turnDamage;             // El daño que el estado causa al principio de cada turno.
    private final int turnWithoutAttack;      // Cuántos turnos de parálisis causa el estado.

    /**
     * Constructor para crear un nuevo estado base.
     * @param name El nombre del estado.
     * @param turnsDamageDuration La duración total del estado en turnos.
     * @param turnDamage El daño por turno que inflige.
     * @param turnWithoutAttack Los turnos que el personaje no podrá atacar.
     */
    public BaseStates(String name, int turnsDamageDuration, int turnDamage, int turnWithoutAttack) {
        this.name = name;
        this.turnsDamageDuration = turnsDamageDuration;
        this.turnDamage = turnDamage;
        this.turnWithoutAttack = turnWithoutAttack;
    }

    // --- GETTERS (para obtener los valores de los atributos) ---
    public String getName() {
        return name;
    }

    public int getTurnsDamageDuration() {
        return turnsDamageDuration;
    }

    public int getTurnDamage() {
        return turnDamage;
    }

    public int getTurnWithoutAttack() {
        return turnWithoutAttack;
    }

    // --- SETTERS (para modificar los valores) ---
    /**
     * Permite actualizar la duración restante del estado.
     * Se usa cada turno para reducir el contador hasta que el efecto desaparece.
     * @param turnsDamageDuration El nuevo número de turnos restantes.
     */
    public void setTurnsDamageDuration(int turnsDamageDuration) {
        this.turnsDamageDuration = turnsDamageDuration;
    }
}
