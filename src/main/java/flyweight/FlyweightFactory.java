package flyweight;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by helmeter on 5/4/16.
 */
public class FlyweightFactory {
    private Map<String,Flyweight> fsMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);

        if (null == f){
            f = new ConcreteFlyweight(key);
            fsMap.put(key,f);
        }else {
            System.out.println(key +" already created by users");
        }
        return f;
    }
}
