package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteAggregate extends Aggregate {


    private List<Object> items = new ArrayList();

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public int getSize(){

       return items.size();
    }

    public Object getItem(int i){


        return items.get(i);
    }

    public boolean setItem(Object item){
        return items.add(item);

    }
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
