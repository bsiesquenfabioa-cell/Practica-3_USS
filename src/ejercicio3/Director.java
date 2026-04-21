package ejercicio3;

public class Director {

    public void construirReporteContable(ReportePDF.Builder builder) {
        builder
            .conEncabezado()
            .conTablaDatos()
            .setAutor("Contabilidad");
    }

    public void construirReporteGerencia(ReportePDF.Builder builder) {
        builder
            .conEncabezado()
            .conResumenEjecutivo()
            .setAutor("Gerencia");
    }

    public void construirReporteLegal(ReportePDF.Builder builder) {
        builder
            .conEncabezado()
            .conFirmaDigital()
            .conPieLegal()
            .setAutor("Legal");
    }
}