package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

public class Maggiore extends Militare {

    @Override
    public boolean guadagnaAlmeno(int confronto) {
        int stipendio = 3000;
        return stipendio >= confronto;
    }

    @Override
    public void printComment(int confronto) {
        if (this.guadagnaAlmeno(confronto)){
            System.out.println("Il maggiore guadagna più di "+confronto+" €");
        } else{
            System.out.println("Il maggiore guadagna meno di "+confronto+" €");
        }
        this.next(confronto);
    }
}
