package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

public class Generale extends Militare {

    @Override
    public boolean guadagnaAlmeno(int confronto) {
        int stipendio = 5000;
        return stipendio >= confronto;
    }

    @Override
    public void printComment(int confronto) {
        if (this.guadagnaAlmeno(confronto)){
            System.out.println("Il generale guadagna più di "+confronto+" €");
        } else{
            System.out.println("Il generale guadagna meno di "+confronto+" €");
        }
        this.next(confronto);
    }
}
