import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReverseIndex implements Index {

    private Map<String, Term> indexMap;
    private Map<Integer, String> rankMap;

    ReverseIndex() {
        indexMap = new HashMap<String, Term>();
        rankMap = new TreeMap<Integer, String>();
    }

    public void addTerm(String word, Term term) {
        indexMap.put(word, term);
        rankMap.put(term.getOccurrences(), word);
    }

    public void deleteIndex(String word) {
        Term term = getTerm(word);
        term.deleteDocuments();
    }

    public List<Document> getDocumentsForWord(String word) {
        return null;
    }

    public Term getTerm(String word) {
        return indexMap.get(word);
    }

    public boolean searchWord(List<String> sentences) {
        return false;
    }
}
