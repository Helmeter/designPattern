package observe;
/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteObserver implements Observer {
    private String observerState;
    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getSubjectState();
        System.out.println("setSubjectState: " + observerState);
    }
}
