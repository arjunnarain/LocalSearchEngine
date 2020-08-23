import java.util.Arrays;
import java.util.List;

public interface Search {

    List<String> splitSearchString(String delimiter, String searchString);
    List<Document> getSearchResults(String word);
    void printSearchResults();
    List<String> getCumulativeResults();
}
