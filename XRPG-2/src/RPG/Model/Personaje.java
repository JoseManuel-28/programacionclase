package RPG.Model;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private int id; //PK
    private String nombre;
    private int nivel;
    private int oro;
    private int vida_actual;
    private int id_raza; //FK
    private int id_clase; //FK
    private int id_ciudad_actual;
    private List<Items> inventario;
    private List<Habilidades> Habilidades;



    public Personaje(int id, String nombre, int nivel, int oro, int vida_actual, int id_raza, int id_clase, int id_ciudad_actual, List<Items> inventario, List<Habilidades> Habilidades) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vida_actual = vida_actual;
        this.id_raza = id_raza;
        this.id_clase = id_clase;
        this.id_ciudad_actual = id_ciudad_actual;
        this.inventario = inventario;
        this.Habilidades = Habilidades;
    }

    public Personaje(String nombre, int id_raza, int id_clase) {
        this.nombre = nombre;
        this.id_raza = id_raza;
        this.id_clase = id_clase;
        // Los valores iniciales los puedes prefijar aquí
        this.nivel = 1;
        this.oro = 100; // Por ejemplo, el oro inicial
        this.vida_actual = 50; // La vida inicial
        this.id_ciudad_actual = 1; // La ciudad inicial
        this.inventario = new ArrayList<>();
        this.Habilidades = new ArrayList<>();
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

    public int getId_raza() {
        return id_raza;
    }

    public void setId_raza(int id_raza) {
        this.id_raza = id_raza;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public int getId_ciudad_actual() {
        return id_ciudad_actual;
    }

    public void setId_ciudad_actual(int id_ciudad_actual) {
        this.id_ciudad_actual = id_ciudad_actual;
    }

    public List<Items> getInventario() {
        return inventario;
    }

    public void setInventario(List<Items> inventario) {
        this.inventario = inventario;
    }

    public List<Habilidades> getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(List<Habilidades> habilidades) {
        Habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", oro=" + oro +
                ", vida_actual=" + vida_actual +
                ", id_raza=" + id_raza +
                ", id_clase=" + id_clase +
                ", id_ciudad_actual=" + id_ciudad_actual +
                ", inventario=" + inventario +
                ", Habilidades=" + Habilidades +
                '}';
    }
}
