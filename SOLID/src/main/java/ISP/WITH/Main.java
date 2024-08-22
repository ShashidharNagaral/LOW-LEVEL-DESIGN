package ISP.WITH;

public class Main {
    public static void main(String[] args) {
        PDFReportGenerator pdfFileGenerator = new PDFFileGenerator();
        ExcelReportGenerator excelFileGenerator = new ExcelFileGenerator();

        pdfFileGenerator.PDFReportGenerator();
        excelFileGenerator.ExcelReportGenerator();


        // pdfFileGenerator.ExcelReportGenerator();
        // excelFileGenerator.PDFReportGenerator();
    }
}
