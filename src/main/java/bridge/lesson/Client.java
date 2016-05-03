package bridge.lesson;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {


    public static void main(String[] args) {
        DepartMents departMents;

        departMents = new Computer();

        departMents.setMath(new AdvanceMath());

        departMents.select();
    }
}
