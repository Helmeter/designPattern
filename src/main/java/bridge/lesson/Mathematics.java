package bridge.lesson;

/**
 * Created by helmeter on 5/3/16.
 */
public class Mathematics extends DepartMents{


    public void select() {
        System.out.println("数学系同学开始选课");
        ((Math)math).select();
    }
}
