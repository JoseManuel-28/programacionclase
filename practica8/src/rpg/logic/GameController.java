package rpg.logic;

import org.w3c.dom.ls.LSOutput;
import rpg.ui.MenuUtils;

import java.util.Scanner;

public class GameController {
    private MenuUtils menuUtils = new MenuUtils();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar () {

        int botonPulsado;

        do {
            menuUtils.mostrarMenuPrincipar();

            botonPulsado = scanner.nextInt();
            scanner.nextLine();

            switch (botonPulsado) {
                case 1:
                    System.out.println("Creando personaje...");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Viajando de ciudad...");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Entando a la tienda...");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Cobrando Impuestos");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Entrando al combate");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Mostrando Estadísticas");
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
            }
        } while (botonPulsado != 0);
        System.out.println("—————————————————》✧《——————————————————");
        System.out.println("* ¡GRACIAS POR JUGAR A XRPG GUILD! *");
        System.out.println("* ¡HASTA LA PRÓXIMA!               *");
        System.out.println("—————————————————》✧《——————————————————");
    }
}
