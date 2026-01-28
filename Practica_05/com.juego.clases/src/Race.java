/**
 * Representa una de las razas del juego (ej. Humano, Elfo, Orco).
 * De momento, la raza es principalmente un rasgo descriptivo del personaje.
 * En el futuro, cada raza podría tener sus propias ventajas o desventajas.
 */
public class Race {
    // --- ATRIBUTOS ---
    private final String name; // El nombre de la raza.

    /**
     * Constructor para crear una nueva raza.
     * @param name El nombre que identificará a la raza.
     */
    public Race(String name) {
        this.name = name;
    }

    // --- GETTERS ---
    /**
     * Devuelve el nombre de la raza.
     * @return El nombre de la raza.
     */
    public String getName() {
        return name;
    }
}
