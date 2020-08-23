import java.util.List;

public interface Index {

    void addTerm(String word, Term term);
    void deleteIndex(String word);
    List<Document> getDocumentsForWord(String word);
    Term getTerm(String word);
    boolean searchWord(List<String> sentences);
}
