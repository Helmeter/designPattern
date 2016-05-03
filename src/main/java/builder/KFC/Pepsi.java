package builder.KFC;

/**
 * Created by helmeter on 5/3/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }


    public String name() {
        return "Pepsi";
    }
}
