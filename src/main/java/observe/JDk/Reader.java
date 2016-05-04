package observe.JDk;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by helmeter on 5/4/16.
 */
public class Reader implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(Observable o, Object obj) {
        //System.out.println(name + " === " + obj);
        System.out.println(name + " === " + ((NewsPaper)o).getContent());
    }
}
