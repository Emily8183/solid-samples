package ReportGenerator.reportGenerator;

public class CsvReportFactory implements ReportFactory{
    @Override
    public Report createReport() {
        return new CsvReport();
    }

}
