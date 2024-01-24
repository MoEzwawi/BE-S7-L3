package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

public class Colonnello extends Militare {

    @Override
    public boolean guadagnaAlmeno(int confronto) {
        int stipendio = 4000;
        return stipendio >= confronto;
    }

    @Override
    public void printComment(int confronto) {
        if (this.guadagnaAlmeno(confronto)){
            System.out.println("Il colonnello guadagna più di "+confronto+" €");
        } else{
            System.out.println("Il colonnello guadagna meno di "+confronto+" €");
        }
        this.next(confronto);
    }
}
