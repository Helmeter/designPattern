package iterator;

/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteIterator implements Iterator {
    // 持有被迭代的具体的聚合对象
    private ConcreteAggregate aggregate;

    private  int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }


    public Object first() {
        return this.aggregate.getItem(0);
    }

    public Object next() {
        current++;
        if(current<this.aggregate.getSize()){
        return this.aggregate.getItem(current);
        }
        else
            return null;
    }

    public Boolean isDone() {
        Boolean flag = true;
        if(current>=this.aggregate.getSize()){
            flag = false;

        }
        return flag;
    }

    public Object currentItem() {
       return  this.aggregate.getItem(current);
    }
}
