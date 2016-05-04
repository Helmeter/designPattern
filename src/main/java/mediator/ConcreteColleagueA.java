package mediator;

/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	public void someOperation() {
        getMediator().changed(this);
    }
    @Override
    public void say() {
        System.out.println("ConcreteColleagueA " + happyNow());
    }
}