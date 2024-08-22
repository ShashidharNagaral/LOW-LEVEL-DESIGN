package ISP.WITHOUT;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfFileGenerator = new PDFFileGenerator();
        ReportGenerator excelFileGenerator = new ExcelFileGenerator();

        pdfFileGenerator.PDFReportGenerator();
        excelFileGenerator.ExcelReportGenerator();

        pdfFileGenerator.ExcelReportGenerator(); // throws UnsupportedOperationException
        excelFileGenerator.PDFReportGenerator(); // throws UnsupportedOperationException
    }
}
