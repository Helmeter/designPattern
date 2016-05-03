package builder.KFC;

/**
 * Created by helmeter on 5/3/16.
 */
public abstract class Burger implements Item {


    public Packing packing() {
        return new Wrapper();
    }


    public abstract float price();
}
