public class Character {
    public String name;
    public int age;
    public Role role;
    public Race race;
    public Sex sex;

    public Character(String name, int age, Sex sex, Role role, Race race) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.role = role;
        this.race = race;

    }
}
