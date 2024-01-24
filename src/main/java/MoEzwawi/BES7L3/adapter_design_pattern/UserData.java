package MoEzwawi.BES7L3.adapter_design_pattern;

import lombok.ToString;

@ToString
public class UserData {
    private String nomeCompleto;
    private int età;
    public void setData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.età = ds.getEtà();
    }
}
