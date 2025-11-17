public class Main {
    public static void main (String[] args) {

        /*Usuario user = new Usuario(
                "Jose Manuel",
                "Martinez Cama",
                "11405",
                "Plaza Ubrique",
                "jose@gmail.com",
                "122345"
        );
        System.out.println(user.getNombre());
        user.setNombre("Josema");
        System.out.println("nombre cambiando: " + user.getNombre());
        System.out.println(user.getEmail());
        user.setEmail("josema@gmail.com");
        System.out.println("Email cambiado: " + user.getEmail());
        System.out.println(user.getApellidos());
        user.setApellidos("Molina Fernandez");
        System.out.println("El apellido cambiado es: " + user.getApellidos());*/

        Usuario user1 = new Usuario("José Manuel", "Martínez Cama", "11405", "Plaza ubrique","jose@gmail.com","123123");
        Usuario user2 = new Usuario("Jaime", "Soto Ferrer", "11591", "San Juan De La Cruz", "jaime@gmail.com", "121212");
        Usuario user3 = new Usuario("Adrian", "Quiros Romero", "11406", "Manuel Fernandez Caballero", "adrian@gmail.com", "343434");

        Usuario[] usuario = new Usuario[3];
        usuario[0] = user1;
        usuario[1] = user2;
        usuario[2] = user3;

        validarRegistro(usuario);

    }

    private static void validarRegistro(Usuario[] usuario) {
        for(int i = 0; i < usuario.length; i++){
            if(usuario[i].getCodigoPostal().startsWith("28")){
                System.out.println("Código postal válido");
            }else {
                System.out.println("ERROR: " + usuario[i].getNombre() +" bloqueado" + " Código postal no permitido");
            }
        }
    }
}
