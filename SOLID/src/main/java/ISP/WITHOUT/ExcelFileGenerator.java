package ISP.WITHOUT;

public class ExcelFileGenerator implements ReportGenerator{
    @Override
    public void PDFReportGenerator() {
        throw new UnsupportedOperationException("ExcelFileGenerator does not support PDF generator.");
    }

    @Override
    public void ExcelReportGenerator() {
        System.out.println("generating Excel report!");
    }
}
