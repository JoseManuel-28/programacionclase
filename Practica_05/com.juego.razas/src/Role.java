import java.util.ArrayList;

public class Role {
    public String name;
    public int health;
    public int defense;
    public int mana;
    public int attack;
    public ArrayList<States> states;
    public Skill[] skills;

    public Role(String name, int health, int defense, int mana, int attack, Skill[] skills,ArrayList<States> states) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.mana = mana;
        this.attack = attack;
        this.states = states;
        this.skills = skills;
    }
}
