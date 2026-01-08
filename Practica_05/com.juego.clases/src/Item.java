public class Item {
    public String name;
    public int healthIncrease;
    public int defenseIncrease;
    public int manaIncrease;
    public int attackIncrease;

    public Item(String name, int healthIncrease, int attackIncrease, int manaIncrease, int defenseIncrease) {
        this.name = name;
        this.healthIncrease = healthIncrease;
        this.attackIncrease = attackIncrease;
        this.manaIncrease = manaIncrease;
        this.defenseIncrease = defenseIncrease;
    }
}
