package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

public class Capitano extends Militare {
    private final int stipendio = 1000;

    @Override
    public boolean guadagnaAlmeno(int confronto) {
        return this.stipendio >= confronto;
    }

    @Override
    public void printComment(int confronto) {
        if (this.guadagnaAlmeno(confronto)){
            System.out.println("Il tenente guadagna più di "+confronto+" €");
        } else{
            System.out.println("Il tenente guadagna più di "+confronto+" €");
        }
        this.next(confronto);
    }
}
