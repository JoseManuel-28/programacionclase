public class StatesToApply extends BaseStates{
    public int probabilityApplying;

    public StatesToApply(String name,int probabilityApplying, int turnsDamageDuration, int turnDamage,int turnWithoutAttack) {
        super(name, turnsDamageDuration, turnDamage,turnWithoutAttack);
        this.probabilityApplying = probabilityApplying;
    }
}
