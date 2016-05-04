package command;
/**
 * Created by helmeter on 5/4/16.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand(receiver);
        Command command2 = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.setCommand(command2);
        invoker.runCommand();
        invoker.cancleCommand(command1);
        invoker.runCommand();
    }
}
