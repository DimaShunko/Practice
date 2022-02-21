package TaskThree;

import java.util.Scanner;
import java.util.*;

public class main {
    public static void main (String [] args ) {
        Scanner in = new Scanner(System.in);
        List<Command> commands = new ArrayList<>();
        commands.add(new Time());
        commands.add(new Date());
        commands.add(new Exit());
        commands.add(new Dir());
        commands.add(new Help());

        while (true) {
            System.out.print(">>");
            String cmd = in.nextLine();
            int n = 0;
            for (Command command : commands)
                if (command.getName().contentEquals(cmd)) {
                    command.exec();
                    n +=1;
                    break;
                }
            if (n == 0){
                System.out.println("There is on such commands, in order to see all the commands, enter 'help'");
            }
        }
    }
}