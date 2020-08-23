import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AndSearch implements Search{
    List<String> wordList;
    Index index;
    void Search(String delimiter, String searchString, Index index) {
        wordList = new ArrayList<String>();
        wordList = splitSearchString(delimiter, searchString);
        this.index = index;
    }
    public List<String> splitSearchString(String delimiter, String searchString) {
        return Arrays.asList(searchString.split(delimiter));
    }

    public List<Document> getSearchResults(String word) {
        return index.getDocumentsForWord(word);
    }

    public void printSearchResults() {
        List<String> results = getCumulativeResults();
        for(String result : results)
            System.out.println(result);
    }

    public List<String> getCumulativeResults() {
        List<Document> combinedDocumentList = new ArrayList<Document>();
        List<String> combinedStringList = new ArrayList<String>();
        List<String> resultSet = new ArrayList<String>();
        // implementation for AND logic.
        //for OR logic we can simply select the print the distinct ones from the list
        //by copying the result set into a Set which will not allow duplicates.
        for(String searchWord : wordList)
            combinedDocumentList.addAll(getSearchResults(searchWord));
        for (Document document : combinedDocumentList) {
            if(!combinedStringList.contains(document.getDocumentString()))
                combinedStringList.add(document.getDocumentString());
            else
                resultSet.add(document.getDocumentString());
        }
        return resultSet;
    }
}
