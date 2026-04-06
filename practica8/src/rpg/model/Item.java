package rpg.model;

public class Item {

    private int id;
    private String nombre;
    private String tipo;
    private int precio_oro;
    private int bonificador_ataque;
    private int getBonificador_defensa;

    public Item(int id, String nombre, String tipo, int precio_oro, int bonificador_ataque, int getBonificador_defensa) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio_oro = precio_oro;
        this.bonificador_ataque = bonificador_ataque;
        this.getBonificador_defensa = getBonificador_defensa;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio_oro() {
        return precio_oro;
    }

    public void setPrecio_oro(int precio_oro) {
        this.precio_oro = precio_oro;
    }

    public int getBonificador_ataque() {
        return bonificador_ataque;
    }

    public void setBonificador_ataque(int bonificador_ataque) {
        this.bonificador_ataque = bonificador_ataque;
    }

    public int getGetBonificador_defensa() {
        return getBonificador_defensa;
    }

    public void setGetBonificador_defensa(int getBonificador_defensa) {
        this.getBonificador_defensa = getBonificador_defensa;
    }
}
