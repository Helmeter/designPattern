package builder.study;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {
    public static void main(String[] args) {

        lucy lucy = new lucy();
        tom  tom  = new tom();

        Teacher teacher = new Teacher(lucy);

        teacher.directEx();

        teacher = new Teacher(tom);

        teacher.directEx();

    }





}
