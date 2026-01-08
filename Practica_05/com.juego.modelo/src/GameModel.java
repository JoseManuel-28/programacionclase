import java.util.ArrayList;

public class GameModel {
    //ITEMS
    public Item[] items = new Item[4];
    //STATES
    public StatesToApply[] statesToApply = new StatesToApply[4];
    // SKILLS
    public Skill[] rogueSkills = new Skill[4];
    public Skill[] wizardSkills = new Skill[4];
    public Skill[] knightSkills = new Skill[4];
    public Skill[] archerSkills = new Skill[4];
    //RACES
    public Race[] races = new Race[4];
    //ROLES
    public Role[] roles = new Role[4];

    public GameModel(){
        createItems();
        createStates();
        createSkills();
        createRaces();
        createRoles();
    }

    private void createItems(){
        items[0] = new Item("Poción de Vida", 20,0,0,0);
        items[1] = new Item("Poción de Mana", 0,0,20,0);
        items[2] = new Item("Totem Ataque", 0,20,0,0);
        items[3] = new Item("Totem Defensa", 0,0,0,20);
    }

    private void createStates(){
        statesToApply[0] = new StatesToApply("Envenenamiento", 20, 2, 20, 0);
        statesToApply[1] = new StatesToApply("Paralisis", 20, 0, 0, 2);
        statesToApply[2] = new StatesToApply("Congelacion", 20, 1, 5, 1);
        statesToApply[3] = new StatesToApply("Quemado", 20, 1, 10, 0);
    }

    private void createSkills(){
        //ROGUE SKILLS
        rogueSkills[0] = new Skill("Ataque Espalda", 20, 20, 0,0,0,null);
        rogueSkills[1] = new Skill("Sigilo", 0, 20, 0,0,1,null);
        rogueSkills[2] = new Skill("Puñalada Rápida", 20, 20, 0,0,0,null);
        rogueSkills[3] = new Skill("Huir", 0, 20, 0,0,2,null);

        //KNIGHT SKILLS
        knightSkills[0] = new Skill("Golpe Firme", 20, 20, 0,0,0,null);
        knightSkills[1] = new Skill("Guardia", 0, 20, 20,0,0,null);
        knightSkills[2] = new Skill("Carga", 40, 20, 0,0,1,null);
        knightSkills[3] = new Skill("Corte Preciso", 30, 20, 0,0,0,null);

        //ARCHER SKILLS
        archerSkills[0] = new Skill("Disparo Preciso", 20, 20, 0,0,0,null);
        archerSkills[1] = new Skill("Lluvia de Flechas", 20, 20, 0,0,0, null);

        //WIZARD SKILLS
        ArrayList<StatesToApply> fireBallStates = new ArrayList<StatesToApply>();
        fireBallStates.add(statesToApply[3]);
        wizardSkills[0] = new Skill("Bola de fuego",20,40,0,0,0,fireBallStates);

        wizardSkills[0] = new Skill("Escudo Arcano",0,40,20,0,0,null);

        ArrayList<StatesToApply> boltStates = new ArrayList<StatesToApply>();
        fireBallStates.add(statesToApply[1]);
        wizardSkills[0] = new Skill("Rayo",20,40,0,0,0,boltStates);

        wizardSkills[0] = new Skill("Concentración",0,40,0,20,0,null);
    }

    private void createRaces(){
        races[0] = new Race("Humano");
        races[1] = new Race("Duende");
        races[2] = new Race("Orco");
        races[3] = new Race("Elfo");
    }

    private void createRoles(){
        roles[0] = new Role("Caballero", 200, 100, 100, 10,knightSkills,new ArrayList<>());
        roles[1] = new Role("Mago", 200, 100, 100, 10, wizardSkills, new ArrayList<>() );
        roles[2] = new Role("Arquero", 200, 100, 100, 10, archerSkills, new ArrayList<>() );
        roles[3] = new Role("Picaro", 200, 100, 100, 10, rogueSkills, new ArrayList<>() );

    }
}


