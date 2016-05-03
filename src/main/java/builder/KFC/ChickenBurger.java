package builder.KFC;

/**
 * Created by helmeter on 5/3/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }


    public String name() {
        return "Chicken Burger";
    }
}