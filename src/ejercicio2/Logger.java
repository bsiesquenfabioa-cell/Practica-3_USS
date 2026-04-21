package ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger instance;
    private List<String> historial;

   
    private Logger() {
        historial = new ArrayList<>();
    }

  
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    
    public void registrar(String nivel, String mensaje) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String log = "[" + nivel + "] " + ahora.format(formato) + " - " + mensaje;
        historial.add(log);
    }

    
    public void imprimirHistorial() {
        System.out.println("\n=== HISTORIAL DE LOGS ===");
        for (String log : historial) {
            System.out.println(log);
        }
    }
}
