package TemplateMethodPattern_ReportGenerationSystem;

public class PlainTextReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Plain Text Report Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("Plain Text Report Body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Plain Text Report Footer");
    }
}
