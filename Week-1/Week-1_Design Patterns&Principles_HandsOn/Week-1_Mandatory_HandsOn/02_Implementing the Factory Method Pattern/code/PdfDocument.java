//PdfDocument implements the Document interface.
// Defines specific behavior for opening PDF files.
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
