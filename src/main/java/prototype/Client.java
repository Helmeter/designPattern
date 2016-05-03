package prototype;

/**
 * Created by helmeter on 5/3/16.
 */
public class Client {



        public static void main(String[] args){
            ConcretePrototype1 cp = new ConcretePrototype1();

            cp.getList().add(1);
            for(int i=0; i< 10; i++){
                ConcretePrototype1 clonecp = (ConcretePrototype1)cp.clone();
                clonecp.getList().add(2);
                System.out.println( clonecp.getList());
            }
        }
    }
