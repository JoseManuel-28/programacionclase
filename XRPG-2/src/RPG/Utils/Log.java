package RPG.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private String archivoLog;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Log() {
        this.archivoLog = "practica8/Ficheros/info.log";
    }
    public void escribirLog(String tipo, String mensaje) {
        String hora = LocalDateTime.now().format(dtf);

        // Obtenemos información de quién llamó a este método
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // El índice [2] suele ser quien llamó a escribirLog
        StackTraceElement elemento = stackTrace[2];

        String paquete = elemento.getClassName();
        String path = elemento.getMethodName() + ":" + elemento.getLineNumber();

        // Formateo de la línea: HORA [TIPO] [PAQUETE] [PATH] - MENSAJE
        String lineaLog = String.format("%s [%-5s] [%s] [%s] - %s",
                hora, tipo.toUpperCase(), paquete, path, mensaje);

        try (FileWriter fw = new FileWriter(archivoLog, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(lineaLog);

        } catch (IOException e) {
            System.err.println("Error al escribir en el log: " + e.getMessage());
        }
    }
}