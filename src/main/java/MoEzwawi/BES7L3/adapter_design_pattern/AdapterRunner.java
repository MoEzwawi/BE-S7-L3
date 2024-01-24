package MoEzwawi.BES7L3.adapter_design_pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
//@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------- ADAPTER PATTERN -----------------");
        Info info = new Info("Aldo","Baglio", LocalDate.of(1958,9,20));
        DataInfoAdapter adaptedInfo = new DataInfoAdapter(info);
        UserData userData1 = new UserData();
        userData1.setData(adaptedInfo);
        System.out.println(userData1);
    }
}
