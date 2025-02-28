package ReportGenerator;

public class ReportGenerator {
    public void generateReport(String type) {
        if (type.equals("PDF")) {
            System.out.println("Generating PDF Report...");
            // PDF logic
        } else if (type.equals("CSV")) {
            System.out.println("Generating CSV Report...");
            // CSV logic
        } else if (type.equals("XML")) {
            System.out.println("Generating XML Report...");
            // XML logic
        } else {
            System.out.println("Invalid report type.");
        }
    }

}
