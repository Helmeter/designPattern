package Proxy;

public class Proxy implements Subject{

	private RealSubject realSubject=null;

	public Proxy(){
		this.realSubject = new RealSubject();
	}
	
	public void request() {
		System.out.println("Proxy::request");
		realSubject.request();
	}
}
