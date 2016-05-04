package memento;

/**
 * Created by helmeter on 5/4/16.
 */
public class Originator {
	
	//游戏节点的状态
	private String state = "";
	
	//改变游戏节点的状态
	public void changeState(){
		this.state = "获取开奖号码";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//保留一个备份
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	//恢复一个备份
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
