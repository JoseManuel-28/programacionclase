package RPG.Ui;

import RPG.DAO.PersonajeDAO;
import RPG.Model.Personaje;

import java.util.List;

public class GameController {

    private PersonajeDAO personajeDAO = new PersonajeDAO();

    public GameController(){
        this.personajeDAO = new PersonajeDAO();

    }

    public void listarPersonajes(){
        List<Personaje> lista = personajeDAO.obtenerPersonajes();
        PersonajeDAO personajeDAO = new PersonajeDAO();

        if (lista.isEmpty()){
            System.out.println("Parece que no hay héroes en la Base de Datos");
        }else {
            System.out.println("--- MOSTRANDO PERSONAJES --- ");
            for ( Personaje p : lista){
                System.out.println(" ID " + p.getId() + " Nombre -> " + p.getNombre());
            }
        }
    }

    public void crearPersonaje(String nombre, int id, int id_raza){
        Personaje nuevo = new Personaje(nombre, id, id_raza);
        personajeDAO.InsertarPersonajes(nuevo);
    }
}
