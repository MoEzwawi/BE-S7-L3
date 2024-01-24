package MoEzwawi.BES7L3.composite_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Page implements SomePaper{
    private String content;
    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public int getPageNumber() {
        return 1;
    }
}
