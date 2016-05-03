package prototype.deepClone;

/**
 * Created by helmeter on 5/3/16.
 */
public class Student implements Cloneable
{
    String name;// 常量对象。
    int age;
    Professor p;// 学生1和学生2的引用值都是一样的。
    Student(String name,int age,Professor p)
    {
        this.name=name;
        this.age=age;
        this.p=p;
    }
    public Object clone()
    {
        Student o=null;
        try
        {
            o=(Student)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
        o.p=(Professor)p.clone();
        return o;
    }
}