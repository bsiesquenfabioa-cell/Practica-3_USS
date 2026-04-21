package ejercicio2;

public class Main {
    public static void main(String[] args) {


        Logger moduloLogin = Logger.getInstance();
        Logger moduloTransferencia = Logger.getInstance();
        Logger moduloRetiro = Logger.getInstance();

        
        moduloLogin.registrar("INFO", "Usuario inició sesión");
        moduloTransferencia.registrar("WARNING", "Transferencia de monto alto");
        moduloRetiro.registrar("ERROR", "Error en retiro de dinero");

        
        moduloLogin.imprimirHistorial();

        
        System.out.println("\nHashCodes:");
        System.out.println("Login: " + moduloLogin.hashCode());
        System.out.println("Transferencia: " + moduloTransferencia.hashCode());
        System.out.println("Retiro: " + moduloRetiro.hashCode());
    }
}
