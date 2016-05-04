package memento;

/**
 * Created by helmeter on 5/4/16.
 */
public class Memento {
	
	//游戏节点的状态
	private String state = "";
	
	//通过构造函数传递状态信息
	public Memento(String state){
		this.state = state;
	}
	
	public String getState() {
		return state;
	}


}
