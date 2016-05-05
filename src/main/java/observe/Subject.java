package observe;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by helmeter on 5/4/16.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {

        int i = observers.indexOf(observer);
        if (i >= 0) {

            observers.remove(i);
        }

    }

    protected void notifyObservers() {
        for( Observer observer : observers) {
            observer.update(this);
        }
    }
}
