public class actuadores extends equipos {
    public sensores sensores;

    public actuadores(int numSerie, sensores sensores) {
        super(numSerie);
        this.sensores = sensores;
    }
}
