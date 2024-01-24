package MoEzwawi.BES7L3.composite_design_pattern;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class Book extends Chapter{
    @Setter
    private String title;
    @Setter
    private double price;
    private List<String> authors;

    public Book(String title, double price, List<String> authors) {
        this.title = title;
        this.price = price;
        this.authors = authors;
    }
    public void addAuthor(String author){
        this.authors.add(author);
    }
}
