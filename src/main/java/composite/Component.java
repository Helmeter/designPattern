package composite;

/**
 * Created by helmeter on 5/4/16.
 */
public abstract class Component {

    protected  String  name;

    public  Component (String name){

        this.name = name;
    }

    public  abstract  void add(Component component);
    public  abstract  void remove(Component component);
    public  abstract  void show(int depth);


}
