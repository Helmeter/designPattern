package iterator;


import observe.Observer;

/**
 * Created by helmeter on 5/4/16.
 */
public interface Iterator {

    Object first();

    Object next();

    Boolean isDone();

    Object currentItem();
}
