// Main.java
public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        // Generate a PDF report
        System.out.println("Generating PDF Report:");
        ReportGenerator pdfReport = new PDFReportGenerator();
        reportingSystem.generateReport(pdfReport);

        // Generate an HTML report
        System.out.println("Generating HTML Report:");
        ReportGenerator htmlReport = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlReport);

        // Generate a Plain Text report
        System.out.println("Generating Plain Text Report:");
        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        reportingSystem.generateReport(plainTextReport);
    }
}
