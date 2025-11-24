public class Contrato {


    //Atributos
    private static int fechaDeCreacion;
    private Medico medico;
    private Hospital hospital;


    //Constructor
    public Contrato (int fc, Medico med, Hospital hos){
        this.fechaDeCreacion = fc;
        this.medico = med;
        this.hospital = hos;
    }


    //Getter
    public static int getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public Medico getMedico() {
        return medico;
    }
    public Hospital getHospital() {
        return hospital;
    }


    //Setter
    public static void setFechaDeCreacion(int fechaDeCreacion) {
        Contrato.fechaDeCreacion = fechaDeCreacion;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
