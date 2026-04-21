package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        
        ReportePDF.Builder builderContable = new ReportePDF.Builder("Reporte Contable");
        director.construirReporteContable(builderContable);
        ReportePDF reporteContable = builderContable.build();
        reporteContable.mostrar();

        
        ReportePDF.Builder builderGerencia = new ReportePDF.Builder("Reporte Gerencia");
        director.construirReporteGerencia(builderGerencia);
        ReportePDF reporteGerencia = builderGerencia.build();
        reporteGerencia.mostrar();

       
        ReportePDF.Builder builderLegal = new ReportePDF.Builder("Reporte Legal");
        director.construirReporteLegal(builderLegal);
        ReportePDF reporteLegal = builderLegal.build();
        reporteLegal.mostrar();
    }
}
