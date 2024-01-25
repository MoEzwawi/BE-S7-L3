package MoEzwawi.BES7L3.composite_design_pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BooksRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        SomePaper page1 = new Page("Lorem ipsum dolor 1");
        SomePaper page2 = new Page("Lorem ipsum dolor 2");
        SomePaper page3 = new Page("Lorem ipsum dolor 3");
        SomePaper page4 = new Page("Lorem ipsum dolor 4");
        SomePaper page5 = new Page("Lorem ipsum dolor 5");
        Chapter section1 = new Chapter();
        section1.addMultipleContent(List.of(page1,page2));
        Chapter section2 = new Chapter();
        section2.addMultipleContent(List.of(section1,page3,page4));
        Book book1 = new Book("Tre uomini e una gamba",12.90,List.of("Aldo","Giovanni","Giacomo"));
        book1.addMultipleContent(List.of(section2,page5));
        System.out.println("CIAO A TUTTI!");
        book1.print();
        System.out.println(book1.getPageNumber());
    }
}
