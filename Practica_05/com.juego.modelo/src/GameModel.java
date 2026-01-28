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

    //Nombre de los items utilizado
    private void createItems(){
        items[0] = new Item("Poción de Vida", 20,0,0,0);
        items[1] = new Item("Poción de Mana", 0,0,20,0);
        items[2] = new Item("Totem Ataque", 0,20,0,0);
        items[3] = new Item("Totem Defensa", 0,0,0,20);
    }

    //Nombre de estados que se pueden aplicar
    private void createStates(){
        statesToApply[0] = new StatesToApply("Envenenamiento", 70, 3, 10, 0); // 70% prob, 3 turnos, 10 daño/turno
        statesToApply[1] = new StatesToApply("Paralisis", 50, 0, 0, 2); // 50% prob, 2 turnos sin atacar
        statesToApply[2] = new StatesToApply("Congelacion", 60, 2, 5, 1); // 60% prob, 2 turnos, 5 daño/turno, 1 turno sin atacar
        statesToApply[3] = new StatesToApply("Quemado", 80, 2, 15, 0); // 80% prob, 2 turnos, 15 daño/turno
    }


    //ROGUE SKILLS
    private void createSkills(){
        rogueSkills[0] = new Skill("Ataque Espalda", 35, 20, 0,0,0,5,null);
        rogueSkills[1] = new Skill("Sigilo", 0, 20, 0,0,1,3,null);
        rogueSkills[2] = new Skill("Puñalada Rápida", 25, 20, 0,0,0,5,null);
        rogueSkills[3] = new Skill("Huir", 0, 20, 0,0,2,3,null);

        //KNIGHT SKILLS
        knightSkills[0] = new Skill("Golpe Firme", 30, 20, 0,0,0,5,null);
        knightSkills[1] = new Skill("Guardia", 0, 20, 20,0,0,3,null);
        knightSkills[2] = new Skill("Carga", 50, 20, 0,0,1,5,null);
        knightSkills[3] = new Skill("Corte Preciso", 45, 20, 0,0,0,5,null);

        //ARCHER SKILLS
        ArrayList<StatesToApply> poisonArrowStates = new ArrayList<>();
        poisonArrowStates.add(statesToApply[0]);
        archerSkills[0] = new Skill("Disparo Preciso", 30, 20, 0,0,0,5,null);
        archerSkills[1] = new Skill("Lluvia de Flechas", 35, 20, 0,0,0, 5, null);
        archerSkills[2] = new Skill("Disparo Perforante", 50, 30, 0,0,0, 5, null);
        archerSkills[3] = new Skill("Flecha Venenosa", 20, 25, 0,0,0, 5, poisonArrowStates);


        //WIZARD SKILLS
        ArrayList<StatesToApply> fireBallStates = new ArrayList<>();
        fireBallStates.add(statesToApply[3]);
        wizardSkills[0] = new Skill("Bola de fuego",45,40,0,0,0,5,fireBallStates);

        wizardSkills[1] = new Skill("Escudo Arcano",0,40,20,0,0,3,null);

        ArrayList<StatesToApply> boltStates = new ArrayList<>();
        boltStates.add(statesToApply[1]);
        wizardSkills[2] = new Skill("Rayo Paralizante",30,40,0,0,0,5,boltStates);

        wizardSkills[3] = new Skill("Concentración",0,40,0,20,0,3,null);
    }

    private void createRaces(){
        races[0] = new Race("Humano");
        races[1] = new Race("Duende");
        races[2] = new Race("Orco");
        races[3] = new Race("Elfo");
    }

    private void createRoles(){
        roles[0] = new Role("Caballero", 200, 12, 200, 25,knightSkills,new ArrayList<>());
        roles[1] = new Role("Mago", 200, 5, 200, 12, wizardSkills, new ArrayList<>() );
        roles[2] = new Role("Arquero", 200, 8, 200, 22, archerSkills, new ArrayList<>() );
        roles[3] = new Role("Picaro", 200, 6, 200, 20, rogueSkills, new ArrayList<>() );
    }
}
