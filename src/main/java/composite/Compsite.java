package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 5/4/16.
 */
public class Compsite extends  Component {

    public Compsite(String name) {
        super(name);
    }

    private List<Component> child = new ArrayList<Component>();
    public void add(Component component) {
         child.add(component);
    }

    public void remove(Component component) {
      child.remove(component);
    }

    public void show(int depth) {
     for(int i=0;i<depth ;i++ ){

         System.out.print("+");

     }
        System.out.println(name);

        for(Component item :child){

            item.show(depth+2);
        }
    }
}
