package singleton;

import java.util.Date;


public class Singleton {
    private static Singleton uniqueInstance = null;
    private Date date = null ;  // 对象创建的时间

    private Singleton(){
        date = new Date();
    }
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // do something
    public void  doSomething(){
        System.out.println("Create at "+date.toString());
    }
}
