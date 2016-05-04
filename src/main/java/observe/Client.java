package observe;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject sub = new ConcreteSubject();
        ConcreteObserver o1 = new ConcreteObserver();
        ConcreteObserver o2 = new ConcreteObserver();

        sub.attach(o1);
        sub.attach(o2);

        sub.setSubjectState("AAA");
        sub.setSubjectState("BBB");

        sub.detach(o1);
        sub.setSubjectState("CCC");

        sub.detach(o2);
        sub.setSubjectState("DDD");

        sub.setSubjectState("EEE");
    }
}
