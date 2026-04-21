package ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Simulando distintos módulos del sistema
        DatabaseConnection db1 = DatabaseConnection.getInstance(); // Carrito
        DatabaseConnection db2 = DatabaseConnection.getInstance(); // Inventario
        DatabaseConnection db3 = DatabaseConnection.getInstance(); // Reportes

        // Ejecutar consultas desde diferentes "módulos"
        db1.ejecutarConsulta("SELECT * FROM usuarios");
        db2.ejecutarConsulta("UPDATE productos SET stock = 10");
        db3.ejecutarConsulta("DELETE FROM carrito WHERE id = 5");

        // Verificar que es la misma instancia
        System.out.println("\nVerificación de instancias:");
        System.out.println("db1 hashCode: " + db1.hashCode());
        System.out.println("db2 hashCode: " + db2.hashCode());
        System.out.println("db3 hashCode: " + db3.hashCode());
    }
}