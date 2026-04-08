package rpg.logic;

import org.w3c.dom.ls.LSOutput;
import rpg.dao.CiudadDAO;
import rpg.dao.PersonajeDAO;
import rpg.model.Ciudad;
import rpg.model.Personaje;
import rpg.ui.MenuUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private MenuUtils menuUtils = new MenuUtils();
    private Scanner scanner = new Scanner(System.in);
    private List<Ciudad> ciudadesList;
    private CiudadDAO ciudadDAO;
    private List<Personaje> personajeList;
    private PersonajeDAO personajeDAO;

    public GameController() {
        this.ciudadDAO = new CiudadDAO();
        this.ciudadesList = new ArrayList<>();
        this.personajeDAO = new PersonajeDAO();
        this.personajeList = new ArrayList<>();


        //no borrar
        conectar();
    }

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

                    for (Ciudad c : ciudadesList) {
                        System.out.println(c.toString());
                    }

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
                case 7:
                    break;
                case 8:
                    for (Personaje p : personajeList){
                        System.out.println(p.toString());
                    }
            }
        } while (botonPulsado != 0);
        System.out.println("—————————————————》✧《——————————————————");
        System.out.println("* ¡GRACIAS POR JUGAR A XRPG GUILD! *");
        System.out.println("* ¡HASTA LA PRÓXIMA!               *");
        System.out.println("—————————————————》✧《——————————————————");
    }

    public void conectar() {
        ciudadesList = ciudadDAO.listarCiudades();
        personajeList = personajeDAO.listarPersonajes();
    }
}
