package MoEzwawi.BES7L3.adapter_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
public class Info implements DataSource{
    private String Nome;
    private String cognome;
    private LocalDate dataDiNascita;

    @Override
    public String getNomeCompleto() {
        return this.getNome()+" "+this.cognome;
    }

    @Override
    public int getEtà() {
        return Period.between(this.dataDiNascita,LocalDate.now()).getYears();
    }
}
