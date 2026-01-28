import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewController {
    private final GameModel gameModel;
    private final Scanner scanner = new Scanner(System.in);

    public ViewController() {
        GameController gameController = new GameController();
        gameModel = new GameModel();

        showIntro();
        Character player = createCharacter();
        // La raza se obtiene directamente del personaje jugador, no del rol.
        Character enemy = new Character("Enemigo", player.getRole(), player.getRace());
        gameController.startCombat(player, enemy);
    }

    private void showIntro() {
        System.out.println("""
                Hace siglos, cuando el mundo aún no tenía nombre, cuatro razas reclamaron la tierra como suya.

                Los hombres, ambiciosos y numerosos, levantaron reinos de piedra y acero. Su don era adaptarse… y conquistar.
                Los orcos, nacidos para la guerra, crecieron en tierras áridas. Honor y fuerza eran su ley, y ningún enemigo sobrevivía a su furia.
                Los elfos, antiguos como los bosques, dominaban la magia y el arco. Observaban desde las sombras, convencidos de que el mundo les pertenecía por derecho.
                Los duendes, pequeños pero astutos, se ocultaban bajo tierra y entre ruinas. No buscaban gloria, solo ventaja… y siempre la encontraban.

                La paz nunca fue real.
                La guerra estalló.

                ¿Salvaréis el mundo… o lo terminaréis de destruir?
                Pulsa ENTER para continuar...""");
        scanner.nextLine();
    }

    private Character createCharacter() {
        System.out.println("\n--- CREACIÓN DE PERSONAJE ---");
        System.out.print("Introduce el nombre de tu personaje: ");
        String name = scanner.nextLine();

        Race created_race = selectRace();
        Role created_role = selectRole();

        System.out.println("\n¡Personaje creado con éxito!");
        return new Character(name, created_role, created_race);
    }

    private Race selectRace() {
        Race[] races = gameModel.getRaces();
        while (true) {
            System.out.println("\nElige una raza:");
            for (int i = 0; i < races.length; i++) {
                System.out.println("  " + (i + 1) + ". " + races[i].getName());
            }
            System.out.print("Tu elección: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (choice > 0 && choice <= races.length) {
                    return races[choice - 1];
                } else {
                    System.out.println("Selección inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes introducir un número.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    private Role selectRole() {
        Role[] roles = gameModel.getRoles();
        while (true) {
            System.out.println("\nElige un rol:");
            for (int i = 0; i < roles.length; i++) {
                System.out.println("  " + (i + 1) + ". " + roles[i].getName());
            }
            System.out.print("Tu elección: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (choice > 0 && choice <= roles.length) {
                    return roles[choice - 1];
                } else {
                    System.out.println("Selección inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes introducir un número.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}
