package rpg.model;

public class PersonajeHabilidad {

    private int id_personaje;
    private int id_habilidad;
    private Boolean equipada;

    public PersonajeHabilidad(int id_personaje, int id_habilidad, Boolean equipada) {
        this.id_personaje = id_personaje;
        this.id_habilidad = id_habilidad;
        this.equipada = equipada;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public int getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public Boolean getEquipada() {
        return equipada;
    }

    public void setEquipada(Boolean equipada) {
        this.equipada = equipada;
    }
}
