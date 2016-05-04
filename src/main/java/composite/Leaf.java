package composite;

/**
 * Created by helmeter on 5/4/16.
 */
public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    public void add(Component component) {
        System.out.println("");
    }

    public void remove(Component component) {
        System.out.println();
    }

    public void show(int depth) {
        for(int i=0;i<depth ;i++ ){

            System.out.print("+");

        }
        System.out.println(name);

    }
}
