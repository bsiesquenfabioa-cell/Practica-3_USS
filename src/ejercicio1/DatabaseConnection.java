package ejercicio1;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private String url;

    // Constructor privado
    private DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/miBD";
        System.out.println("Conexión creada a: " + url);
    }

    // Singleton con doble verificación
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Simulación de consulta
    public void ejecutarConsulta(String sql) {
        System.out.println("Ejecutando: " + sql +
                " | Instancia ID: " + this.hashCode());
    }
}