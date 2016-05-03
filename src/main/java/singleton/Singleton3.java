package singleton;

/**
 * Created by helmeter on 5/3/16.
 */
public class Singleton3 {
    private static Singleton3 ourInstance = new Singleton3();

    public static Singleton3 getInstance() {
        return ourInstance;
    }

    private Singleton3() {
    }
}
