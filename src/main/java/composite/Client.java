package composite;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {

    public static void main(String[] args) {
        Compsite root = new Compsite("根节点");
        root.add(new Leaf("叶子A"));
        root.add(new Leaf("叶子B"));
        Compsite compsite1  = new Compsite("左子树A");
        compsite1.add(new Leaf("叶子AA"));
        compsite1.add(new Leaf("叶子AB"));
        root.add(compsite1);
        root.show(1);

    }
}
