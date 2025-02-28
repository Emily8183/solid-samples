package ReportGenerator.reportGenerator;

public class Client {

    public static void main(String[] args) {
        Report csvReport = new CsvReportFactory().createReport(); 

        csvReport.getReport();

        Report xmlReport = new XmlReportFactory().createReport(); 

        xmlReport.getReport();

        Report pdfReport = new PdfReportFactory().createReport(); 

        pdfReport.getReport();


        
    }

}
