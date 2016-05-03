package builder.KFC;

/**
 * Created by helmeter on 5/3/16.
 */
public abstract class ColdDrink implements Item {


    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();
}