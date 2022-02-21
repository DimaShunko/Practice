package TaskThree;

public class Exit implements Command {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void exec() {
        System.exit(0);

    }
}