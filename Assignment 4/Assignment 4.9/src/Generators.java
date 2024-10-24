// PDFReportGenerator.java
class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting PDF Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting PDF Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting PDF Footer...");
    }
}

// HTMLReportGenerator.java
class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting HTML Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting HTML Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting HTML Footer...");
    }
}

// PlainTextReportGenerator.java
class PlainTextReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting Plain Text Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting Plain Text Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting Plain Text Footer...");
    }
}
