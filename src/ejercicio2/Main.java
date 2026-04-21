package ejercicio2;

public class Main {
    public static void main(String[] args) {

        // Simulación de módulos
        Logger moduloLogin = Logger.getInstance();
        Logger moduloTransferencia = Logger.getInstance();
        Logger moduloRetiro = Logger.getInstance();

        // Registrar eventos
        moduloLogin.registrar("INFO", "Usuario inició sesión");
        moduloTransferencia.registrar("WARNING", "Transferencia de monto alto");
        moduloRetiro.registrar("ERROR", "Error en retiro de dinero");

        // Imprimir historial completo
        moduloLogin.imprimirHistorial();

        // Verificación de que es la misma instancia
        System.out.println("\nHashCodes:");
        System.out.println("Login: " + moduloLogin.hashCode());
        System.out.println("Transferencia: " + moduloTransferencia.hashCode());
        System.out.println("Retiro: " + moduloRetiro.hashCode());
    }
}