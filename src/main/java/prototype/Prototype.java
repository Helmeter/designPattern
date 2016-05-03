package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 5/3/16.
 */
public class Prototype implements Cloneable{
    private ArrayList list = new ArrayList();

    public Prototype clone(){

        Prototype prototype = null;

        try{
            prototype = (Prototype)super.clone();
           prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }

    public List getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
