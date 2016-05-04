package command;

/**
 * Created by helmeter on 5/4/16.
 * 具体命令
 */
public class ConcreteCommand  implements Command {
    private Receiver receiver = null;


    public ConcreteCommand(Receiver receiver) {
        this.receiver =  receiver;
    }

    public void execute() {
        receiver.action();
    }
}
