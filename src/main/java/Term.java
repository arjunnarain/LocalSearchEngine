import java.util.ArrayList;
import java.util.List;

public class Term {
    private List<Document> documents;
    private float computedRank;
    private int occurrences;
    Rank rank;

    public Term(Document document, Rank rank) {
        documents = new ArrayList<Document>();
        addDocument(document);
        addOccurrences();
        this.rank = rank;
    }

    private void computeTermRank() {
        this.computedRank = rank.computeRank(occurrences);
    }

    public void addDocument(Document document) {
        this.documents.add(document);
        addOccurrences();
        computeTermRank();
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void addOccurrences() {
        this.occurrences++;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public float getComputedRank() {
        return computedRank;
    }

    public void deleteDocuments() {
        this.documents = null;
    }
}
