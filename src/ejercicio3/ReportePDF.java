package ejercicio3;

public class ReportePDF {

    private String titulo;
    private boolean encabezado;
    private boolean tablaDatos;
    private boolean resumenEjecutivo;
    private boolean firmaDigital;
    private boolean pieLegal;
    private String autor;

    // Constructor privado
    private ReportePDF(Builder builder) {
        this.titulo = builder.titulo;
        this.encabezado = builder.encabezado;
        this.tablaDatos = builder.tablaDatos;
        this.resumenEjecutivo = builder.resumenEjecutivo;
        this.firmaDigital = builder.firmaDigital;
        this.pieLegal = builder.pieLegal;
        this.autor = builder.autor;
    }

    // Mostrar configuración
    public void mostrar() {
        System.out.println("\n=== " + titulo + " ===");
        System.out.println("Autor: " + autor);
        System.out.println("Encabezado: " + encabezado);
        System.out.println("Tabla de datos: " + tablaDatos);
        System.out.println("Resumen ejecutivo: " + resumenEjecutivo);
        System.out.println("Firma digital: " + firmaDigital);
        System.out.println("Pie legal: " + pieLegal);
    }

    // Builder
    public static class Builder {

        private String titulo;
        private boolean encabezado;
        private boolean tablaDatos;
        private boolean resumenEjecutivo;
        private boolean firmaDigital;
        private boolean pieLegal;
        private String autor;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder conEncabezado() {
            this.encabezado = true;
            return this;
        }

        public Builder conTablaDatos() {
            this.tablaDatos = true;
            return this;
        }

        public Builder conResumenEjecutivo() {
            this.resumenEjecutivo = true;
            return this;
        }

        public Builder conFirmaDigital() {
            this.firmaDigital = true;
            return this;
        }

        public Builder conPieLegal() {
            this.pieLegal = true;
            return this;
        }

        public Builder setAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public ReportePDF build() {
            return new ReportePDF(this);
        }
    }
}