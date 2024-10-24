// ReportGenerator.java
public abstract class ReportGenerator {
    // Template method
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generation complete.\n");
    }

    // Abstract methods for steps that vary
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}
