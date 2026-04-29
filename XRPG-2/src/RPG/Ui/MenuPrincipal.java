package RPG.Ui;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner teclado = new Scanner(System.in);
    GameController gameController = new GameController();
    public void mostrarMenu(){
        int opcion = 0;

        do {
            System.out.println("\n========= XRPG: MENU PRINCIPAL =========");
            System.out.println("1. Ver todos los personajes");
            System.out.println("2. Crear nuevo personaje (En desarrollo)");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");

            if ( teclado.hasNext()){
                opcion = teclado.nextInt();
            }else {
                System.out.println( "Porfavor introduce un método válido");
                teclado.nextLine();
                continue;
            }
            switch (opcion) {
                case 1:
                    gameController.listarPersonajes();
                    break;
                case 2:
                    System.out.println(" PROXIMAMENTE ");
                    break;
                case 3:
                    System.out.println(" PROXIMAMENTE ");
                    break;
            }
        }while (opcion != 3 );

    }

}
