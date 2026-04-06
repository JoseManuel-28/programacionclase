package rpg.ui;

public class MenuUtils {


    public void cabecera() {
        System.out.println();
        System.out.println(" /$$   /$$ /$$$$$$$  /$$$$$$$   /$$$$$$ \n" +
                "| $$  / $$| $$__  $$| $$__  $$ /$$__  $$\n" +
                "|  $$/ $$/| $$  \\ $$| $$  \\ $$| $$  \\__/\n" +
                " \\  $$$$/ | $$$$$$$/| $$$$$$$/| $$ /$$$$\n" +
                "  >$$  $$ | $$__  $$| $$____/ | $$|_  $$\n" +
                " /$$/\\  $$| $$  \\ $$| $$      | $$  \\ $$\n" +
                "| $$  \\ $$| $$  | $$| $$      |  $$$$$$/\n" +
                "|__/  |__/|__/  |__/|__/       \\______/ \n");
    }

    public void elejir_opcion (){
        System.out.println();
        System.out.println("╰────────────────➤[Elija una opcion]\n");
    }

    public void separador(){

    }

    //este mét0do muestra el menú principal
    public void mostrarMenuPrincipar(){
        cabecera();
        System.out.println("1. Crear personaje");
        System.out.println("2. Viajar a ciudad");
        System.out.println("3. Ir a la tienda");
        System.out.println("4. Cobrar impuestos");
        System.out.println("5. Entrar en combate");
        System.out.println("6. Estadísticas");
        System.out.println("0. Salir");
        elejir_opcion();
    }

}

