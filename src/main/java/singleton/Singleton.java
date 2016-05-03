package singleton;

import java.util.Date;


public class Singleton {
    private static Singleton uniqueInstance = null;
    private Date date = null ;  // 对象创建的时间

    private Singleton(){
        date = new Date();
    }
    public static synchronized Singleton getInstance(){
       // synchronized 同步其实降低了性能,只有第一次调用时才需要同步,初始了uniqueInstance后便不需要再进行同步
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //修复性能问题1.声明变量时,初始化2.双重检查加锁 详见singleton2


    // do something
    public void  doSomething(){
        System.out.println("Create at "+date.toString());
    }
}
