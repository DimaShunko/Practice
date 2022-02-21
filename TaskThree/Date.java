package TaskThree;

import java.time.LocalDate;

public class Date implements Command{

    @Override
    public String getName() {
        return "date";
    }

    @Override
    public void exec() {
        LocalDate date =  LocalDate.now();
        System.out.println(date);
    }
}
