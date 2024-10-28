package TemplateMethodPattern_ReportGenerationSystem;

public abstract class ReportGenerator {

    // Template method that defines the steps of the report generation process
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        printReport();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();

    // Concrete method common to all reports
    private void printReport() {
        System.out.println("Report has been generated successfully.");
    }
}
