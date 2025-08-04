// WordDocument implements the Document interface.
// Defines specific behavior for opening Word files.
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}
