package chainofResponsibility;

/**
 * Created by helmeter on 5/4/16.
 */
public class Request {
	private int level;
	
	public Request(int level){
		this.level = level;
	}
	
	//请求的等级
	public int getRequestLevel(){
		return level;
	}
}
