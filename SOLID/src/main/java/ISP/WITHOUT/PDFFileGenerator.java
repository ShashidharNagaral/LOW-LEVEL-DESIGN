package ISP.WITHOUT;

public class PDFFileGenerator implements ReportGenerator{
    @Override
    public void PDFReportGenerator() {
        System.out.println("generating PDF report!");
    }

    @Override
    public void ExcelReportGenerator() {
        throw new UnsupportedOperationException("PDFFileGenerator does not support Excel generator.");
    }
}
