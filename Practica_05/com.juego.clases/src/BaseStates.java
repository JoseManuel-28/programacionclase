public class BaseStates {
    public String name;
    public int turnDamage;
    public int turnsDamageDuration;
    public int turnWithoutAttack;

    public BaseStates(String name, int turnsDamageDuration, int turnDamage, int turnWithoutAttack) {
        this.name = name;
        this.turnsDamageDuration = turnsDamageDuration;
        this.turnDamage = turnDamage;
        this.turnWithoutAttack = turnWithoutAttack;
    }
}
