package Decorator;

/**
 * Created by helmeter on 5/3/16.
 */
public class Decorator  extends  Component{


    protected  Component component;
    public  void setComponent(Component component){
        this.component =component;

    }
    void opration() {
        if(null!=component){

            component.opration();
        }
    }
}
