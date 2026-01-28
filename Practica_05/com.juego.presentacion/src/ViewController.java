import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Gestiona la interfaz de usuario en la consola.
 * Es responsable de mostrar la historia, guiar al jugador en la creación del personaje
 * y dar inicio al combate.
 */
public class ViewController {
    // --- ATRIBUTOS ---
    private final GameModel gameModel;      // Referencia al modelo de datos del juego.
    private final Scanner scanner = new Scanner(System.in); // Objeto para leer la entrada del usuario.

    /**
     * Constructor que prepara e inicia la secuencia del juego.
     */
    public ViewController() {
        GameController gameController = new GameController();
        gameModel = new GameModel();

        showIntro(); // Muestra la introducción de la historia.
        Character player = createCharacter(); // Guía al jugador para crear su personaje.
        
        // Crea un enemigo con el mismo rol y raza que el jugador para el combate.
        Character enemy = new Character("Enemigo", player.getRole(), player.getRace());
        gameController.startCombat(player, enemy); // Inicia el combate.
    }

    /**
     * Muestra el texto de introducción y espera a que el jugador pulse ENTER.
     */
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

    /**
     * Orquesta el proceso de creación del personaje, pidiendo nombre, raza y rol.
     * @return El personaje jugador creado.
     */
    private Character createCharacter() {
        System.out.println("\n--- CREACIÓN DE PERSONAJE ---");
        System.out.print("Introduce el nombre de tu personaje: ");
        String name = scanner.nextLine();

        Race created_race = selectRace();
        Role created_role = selectRole();

        System.out.println("\n¡Personaje creado con éxito!");
        return new Character(name, created_role, created_race);
    }

    /**
     * Muestra un menú para que el jugador elija una raza y gestiona la selección.
     * @return La raza seleccionada.
     */
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
                scanner.nextLine(); // Limpia el buffer del scanner.
                if (choice > 0 && choice <= races.length) {
                    return races[choice - 1];
                } else {
                    System.out.println("Selección inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes introducir un número.");
                scanner.nextLine(); // Limpia el buffer en caso de error.
            }
        }
    }

    /**
     * Muestra un menú para que el jugador elija un rol y gestiona la selección.
     * @return El rol seleccionado.
     */
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
                scanner.nextLine(); // Limpia el buffer.
                if (choice > 0 && choice <= roles.length) {
                    return roles[choice - 1];
                } else {
                    System.out.println("Selección inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes introducir un número.");
                scanner.nextLine(); // Limpia el buffer en caso de error.
            }
        }
    }
}
