package ejercicio1;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private String url;

    
    private DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/miBD";
        System.out.println("Conexión creada a: " + url);
    }
   
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

    public void ejecutarConsulta(String sql) {
        System.out.println("Ejecutando: " + sql +
                " | Instancia ID: " + this.hashCode());
    }
}
