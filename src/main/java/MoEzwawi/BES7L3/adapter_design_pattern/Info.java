package MoEzwawi.BES7L3.adapter_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
public class Info{
    private String Nome;
    private String cognome;
    private LocalDate dataDiNascita;

}
