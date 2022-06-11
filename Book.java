import java.util.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        authors.remove(authors.size() - 1);
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }
}