import java.util.Scanner;

public class ViewController {
    private GameController gameController;
    private GameModel gameModel;

    public ViewController(){
        gameController = new GameController();
        gameModel = new GameModel();

        init();
        createCharacter();
    }

    private void init(){
        System.out.println("Hace siglos, cuando el mundo aún no tenía nombre, cuatro razas reclamaron la tierra como suya.\n" +
                "\n" +
                "Los hombres, ambiciosos y numerosos, levantaron reinos de piedra y acero. Su don era adaptarse… y conquistar.\n" +
                "Los orcos, nacidos para la guerra, crecieron en tierras áridas. Honor y fuerza eran su ley, y ningún enemigo sobrevivía a su furia.\n" +
                "Los elfos, antiguos como los bosques, dominaban la magia y el arco. Observaban desde las sombras, convencidos de que el mundo les pertenecía por derecho.\n" +
                "Los duendes, pequeños pero astutos, se ocultaban bajo tierra y entre ruinas. No buscaban gloria, solo ventaja… y siempre la encontraban.\n" +
                "\n" +
                "La paz nunca fue real. \n" +
                "La guerra estalló.\n" +
                "\n" +
                "¿Salvaréis el mundo… o lo terminaréis de destruir?\n" +
                "Pulsa ENTER para continuar...");

        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // Escuchamos el Enter por teclado
    }

    private void createCharacter() {
        Scanner sc_name = new Scanner(System.in);
        System.out.println("Introduce el nombre del personaje");
        String name = sc_name.next();

        Race created_race = createRace();
        Role created_role = createRole();

        //Character character = new Character(name,null,null,created_role,created_race);
        //Character character2 = new Character(name,null,null,created_role,created_race);
        //gameController.characters
    }

    private Race createRace(){
        while (true) {
            cleanLog();
            System.out.println("Elige una raza:");
            for (int i = 0; i < gameModel.races.length; i++) {
                System.out.println((i + 1) + "º " + gameModel.races[i].name);
            }
            Scanner sc = new Scanner(System.in);

            try {
                int select_race = (sc.nextInt() - 1);
                if (select_race >= 0 && select_race < gameModel.races.length) {
                    return gameModel.races[select_race];
                } else {
                    invalidSelectionMessage();
                }
            } catch (Exception e) {
                invalidSelectionMessage();
            }
        }
    }

    private void invalidSelectionMessage(){
        System.out.println("Selección invalida, pulse ENTER para volver a intentarlo");
        Scanner sc_error = new Scanner(System.in);
        sc_error.nextLine();
    }

    private Role createRole(){
        while (true) {
            cleanLog();
            System.out.println("Elige una rol:");
            for (int i = 0; i < gameModel.roles.length; i++) {
                System.out.println((i + 1) + "º " + gameModel.roles[i].name);
            }
            Scanner sc = new Scanner(System.in);

            try {
                int select_role = (sc.nextInt() - 1);
                if (select_role >= 0 && select_role < gameModel.roles.length) {
                    return gameModel.roles[select_role];
                } else {
                    invalidSelectionMessage();
                }
            } catch (Exception e) {
                invalidSelectionMessage();
            }
        }
    }

    private void cleanLog(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
