package builder.study;

/**
 * Created by helmeter on 5/3/16.
 */
public class Teacher {

    private Student student;

    public Teacher(Student student){
        this.student = student;

    }

    public void directEx(){

        student.preEx();
        student.pourReagent();;
        student.pourCo2();
        student.showResult();

    }
}
