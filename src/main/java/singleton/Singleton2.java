package singleton;

import java.util.Date;

/**
 * Created by helmeter on 5/3/16.
 */
public class Singleton2 {
    //volatile提醒编译器它后面所定义的变量随时都有可能改变，因此编译后的程序每次需要存储或读取这个变量的时候，
    // 都会直接从变量地址中读取数据。如果没有volatile关键字，则编译器可能优化读取和存储，可能暂时使用寄存器中的值，
    // 如果这个变量由别的程序更新了的话，将出现不一致的现象
    private  volatile  static  Singleton2 uniqueInstance;
    private Date date = null ;  // 对象创建的时间
    private Singleton2(){date = new Date();}
    public static  Singleton2 getInstance(){

       if(uniqueInstance == null){

           synchronized (Singleton2.class){

               if(uniqueInstance == null){
                   uniqueInstance = new Singleton2();
               }
           }
       }
        return uniqueInstance;
    }
    // do something
    public void  doSomething(){
        System.out.println("Create at "+date.toString());
    }
}