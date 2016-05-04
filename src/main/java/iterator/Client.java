package iterator;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {
    public static void main(String[] args) {

        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItem(1);
        aggregate.setItem(2);

        Iterator it = new ConcreteIterator(aggregate);


        while (it.isDone()) {
            Object obj = it.currentItem();
            System.out.println("the obj + " + obj);
            it.next();
        }
    }
}
