package MoEzwawi.BES7L3.composite_design_pattern;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Chapter implements SomePaper{
    private List<SomePaper> content = new ArrayList<>();
    @Override
    public void print() {
        for(SomePaper somePaper : content){
            somePaper.print();
        }
    }

    @Override
    public int getPageNumber() {
        /*int total = 0;
        for(SomePaper somePaper : content){
            total += somePaper.getPageNumber();
        }
        return total;*/
        return content.stream().mapToInt(SomePaper::getPageNumber).sum();
    }

    public void addSingleContent(SomePaper somePaper){
        this.content.add(somePaper);
    }
    public void addMultipleContent(List<SomePaper> somePaper){
        this.content.addAll(somePaper);
    }
}
