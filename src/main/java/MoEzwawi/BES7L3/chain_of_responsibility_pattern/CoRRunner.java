package MoEzwawi.BES7L3.chain_of_responsibility_pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoRRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Tenente tenente = new Tenente();
        Capitano capitano= new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale= new Generale();
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);
        tenente.printComment(2500);
    }

}
