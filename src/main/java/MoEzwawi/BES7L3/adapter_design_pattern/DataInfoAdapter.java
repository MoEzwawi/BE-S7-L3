package MoEzwawi.BES7L3.adapter_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
public class DataInfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEtà() {
        return Period.between(info.getDataDiNascita(), LocalDate.now()).getYears();
    }
}
