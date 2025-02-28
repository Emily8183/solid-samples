package ReportGenerator.reportGenerator;

public class XmlReportFactory implements ReportFactory{
    @Override
    public Report createReport() {
        return new XmlReport();
    }



}
