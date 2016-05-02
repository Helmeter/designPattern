package singleton;


public class Client {
    public static  void main(String[] args){

        for (int i=0;i<10;++i){
            Singleton sgt = Singleton.getInstance();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            sgt.doSomething();
        }

    }
}
