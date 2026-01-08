import java.util.ArrayList;

//HABILIDADES
public class Skill {
    public String name; //
    public int damage; //DAÑO
    public int consumptionMana; //CONSUMO DE MANÁ
    public int defenseIncrease; //INCREMENTACION DEFENSA
    public int healthIncrease;//INCREMENTACION VIDA
    public int dodgeTurn; //PASA TURNO
    public ArrayList<StatesToApply> statesToApply;

    public Skill(String name, int damage, int consumptionMana, int defenseIncrease, int healthIncrease, int dodgeTurn, ArrayList<StatesToApply> statesToApply) {
        this.name = name;
        this.damage = damage;
        this.consumptionMana = consumptionMana;
        this.defenseIncrease = defenseIncrease;
        this.healthIncrease = healthIncrease;
        this.dodgeTurn = dodgeTurn;
        this.statesToApply = statesToApply;
    }
}
