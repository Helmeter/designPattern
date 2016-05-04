package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 5/4/16.
 * 传达着
 */

public class Invoker {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }


    public void runCommand() {
       for(Command command:commands){

           command.execute();
       }
    }

    public void cancleCommand(Command command){

        commands.remove(command);

    }
}
