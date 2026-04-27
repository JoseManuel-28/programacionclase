package rpg.model;

public class Personaje {

    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vida_actual;
    private Raza id_raza;
    private int id_clase;
    private Ciudad id_ciudad_actual;

    public Personaje(int id, String nombre, int nivel, int oro, int vida_actual, Raza id_raza, int id_clase, Ciudad id_ciudad_actual) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vida_actual = vida_actual;
        this.id_raza = id_raza;
        this.id_clase = id_clase;
        this.id_ciudad_actual = id_ciudad_actual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVida_actual() {
        return vida_actual;
    }

    public void setVida_actual(int vida_actual) {
        this.vida_actual = vida_actual;
    }

    public Raza getId_raza() {
        return id_raza;
    }

    public void setId_raza(Raza id_raza) {
        this.id_raza = id_raza;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public Ciudad getId_ciudad_actual() {
        return id_ciudad_actual;
    }

    public void setId_ciudad_actual(Ciudad id_ciudad_actual) {
        this.id_ciudad_actual = id_ciudad_actual;
    }

    @Override
    public String toString() {
        return String.format(
                "\n=== %s ===\n" +
                        " NIVEL: %d | HP: %d | ORO: %d\n" +
                        "--------------------------\n" +
                        " Raza: %d | Clase: %d | Ciudad: %d (ID: %d)\n",
                nombre.toUpperCase(), nivel, vida_actual, oro,
                id_raza, id_clase, id_ciudad_actual, id
        );
    }
}
