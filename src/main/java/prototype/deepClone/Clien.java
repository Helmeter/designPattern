package prototype.deepClone;

/**
 * Created by helmeter on 5/3/16.
 */
public class Clien {

    public static void main(String[] args)
    {
        Professor p=new Professor("wangwu",50);
        Student s1=new Student("zhangsan",18,p);
        Student s2=(Student)s1.clone();
        s2.p.name="lisi";
        s2.p.age=30;
        System.out.println("name="+s2.p.name+","+"age="+s1.p.age);//学生1的教授成为lisi,age为30。
    }
}
