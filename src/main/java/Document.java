import java.util.Arrays;
import java.util.List;

public class Document {
    private String documentString;
    private List<String> sentences;
    private int documentSize;

    Document(String sentences) {
        addDocument(sentences);
    }

    private void addDocument(String sentences) {
        this.documentString = sentences;
        parseDocument();
    }

    public String getDocumentString() {
        return documentString;
    }

    private void parseDocument() {
        sentences = Arrays.asList(documentString.split("\n"));
        documentSize = sentences.size();
    }

    public int getDocumentSize() {
        return documentSize;
    }

    public List<String> getSentences() {
        return sentences;
    }
}
