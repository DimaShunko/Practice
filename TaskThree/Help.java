package TaskThree;

public class Help  implements Command {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        System.out.println("time - Moscow time");
        System.out.println("date - world date");
        System.out.println("exit - end of cmd");
        System.out.println("dir - getting the current directory");
    }
}
