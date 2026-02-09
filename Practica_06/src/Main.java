public static void main(String[] args) {

    bloque1 bloque1 = new bloque1();
    ArrayList<String> registro = bloque1.registroMuerte();
    HashSet<String> villanos = bloque1.censoUnico();
    bloque1.bolsaOro();
    bloque1.limpiezaCalabozo(registro);
    bloque1.mercadoHechizos();
    bloque1.expulsionReino(villanos);

    bloque2 bloque2 = new bloque2();
    bloque2.repositorioGremios();
}
