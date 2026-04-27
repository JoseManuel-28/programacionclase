package RPG.Model;

public class Inventarios {

    private int id_personaje; //PK y FK
    private int id_item; //PK y FK

    public Inventarios(int id_personaje, int id_item) {
        this.id_personaje = id_personaje;
        this.id_item = id_item;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }
}
