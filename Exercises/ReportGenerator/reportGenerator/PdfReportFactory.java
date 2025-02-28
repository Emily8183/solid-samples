package ReportGenerator.reportGenerator;

public class PdfReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new PdfReport();
    }

}
