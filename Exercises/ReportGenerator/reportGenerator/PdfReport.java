package ReportGenerator.reportGenerator;

public class PdfReport implements Report{
    @Override
    public void getReport() {
        System.out.println("Generating PDF Report...");
    };

}
