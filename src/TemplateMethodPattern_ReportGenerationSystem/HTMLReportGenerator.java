package TemplateMethodPattern_ReportGenerationSystem;

public class HTMLReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("<header>HTML Report Header</header>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<body>HTML Report Body</body>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report Footer</footer>");
    }
}
