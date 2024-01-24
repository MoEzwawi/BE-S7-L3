package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Militare {
    protected Militare responsabile;
    public abstract boolean guadagnaAlmeno(int confronto);
    public abstract void printComment(int confronto);
    public void next(int confronto){
        if(this.responsabile != null){
            this.responsabile.printComment(confronto);
        } else{
            System.out.println("E nessuno guadagna più di lui!");
        }
    }
}
