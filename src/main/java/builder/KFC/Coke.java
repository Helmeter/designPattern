package builder.KFC;

/**
 * Created by helmeter on 5/3/16.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }


    public String name() {
        return "Coke";
    }
}