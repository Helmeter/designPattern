package bridge.lesson;

/**
 * Created by helmeter on 5/3/16.
 */
public class Computer extends  DepartMents {


    public void select() {
        System.out.println("计算机系的同学选课");
        ((Math)math).select();
    }
}
