package rpg.logic;

import org.w3c.dom.ls.LSOutput;
import rpg.dao.CiudadDAO;
import rpg.dao.ClaseRPGDAO;
import rpg.dao.HabilidadDAO;
import rpg.dao.PersonajeDAO;
import rpg.model.Ciudad;
import rpg.model.ClaseRPG;
import rpg.model.Habilidad;
import rpg.model.Personaje;
import rpg.ui.MenuUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;


// TODO: Preparar la estructura para cargar y guardar toda la información
//  necesaria del RPG (datos del mundo y progreso de los jugadores).
public class GameController {
    private MenuUtils menuUtils = new MenuUtils();
    private Scanner scanner = new Scanner(System.in);
    private List<Ciudad> ciudadesList;
    private CiudadDAO ciudadDAO;
    private List<Personaje> personajeList;
    private PersonajeDAO personajeDAO;
    private List<ClaseRPG> claseRPGList;
    private ClaseRPGDAO claseRPGDAO;
    private List<Habilidad> habilidadList;
    private HabilidadDAO HabilidadDAO;


    // TODO: Constructor - Inicializa los conectores a la base de datos (DAOs)
    //  y crea los sacos vacíos (ArrayLists) donde guardaremos la información.
    public GameController() {
        this.ciudadDAO = new CiudadDAO();
        this.ciudadesList = new ArrayList<>();
        this.personajeDAO = new PersonajeDAO();
        this.personajeList = new ArrayList<>();
        this.claseRPGDAO = new ClaseRPGDAO();
        this.claseRPGList = new ArrayList<>();
        this.habilidadList = new ArrayList<>();
        this.HabilidadDAO = new HabilidadDAO();

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

                    // Esto muestra las ciudades
                    for (Ciudad c : ciudadesList) {
                        System.out.println(c.toString());
                    }
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
                case 7://Prueba es estadisticas
                    System.out.println("Mostrando Personaje");
                    System.out.println();
                    for (ClaseRPG cRPG: claseRPGList){
                        System.out.println(cRPG.toString());
                    }
                    System.out.println();
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Observando personaje...");
                    System.out.println();
                    for (Personaje p : personajeList){
                        System.out.println(p.toString());
                    }
                    System.out.println("PULSE [ ENTER ] PARA SALIR...");
                    scanner.nextLine();

                    // TODO: Esto sirve para mostrar las habilidades
                    /*for (Habilidad h : habilidadList) {
                        System.out.println(h.toString());
                    }*/

                    // TODO: Esto sirve para mostrar las clases
                     /*for (ClaseRPG cRPG: claseRPGList){
                        System.out.println(cRPG.toString());
                    }*/

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
        claseRPGList = claseRPGDAO.listarclases();
        habilidadList = HabilidadDAO.listarHabilidades();
    }
}
