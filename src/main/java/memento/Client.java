package memento;

/**
 * Created by helmeter on 5/4/16.
 */
public class Client {

	public static void main(String[] args) {
		//主角
		Originator winNotice = new Originator();
		//备忘录的管理者
		Caretaker caretaker = new Caretaker();
		//初始化当前状态
		winNotice.setState("获取开奖公告");
		System.out.println("=====游戏现在的状态======");
		System.out.println(winNotice.getState());
		//需要记录下当前状态呀
		caretaker.setMemento(winNotice.createMemento());
		//发现开奖公告中的开奖号码与已获得的开奖号码不一致，状态改变
		winNotice.changeState();
		System.out.println("\n=====状态改变后的状态======");
		System.out.println(winNotice.getState());
		//状态改变后，恢复原状
		winNotice.restoreMemento(caretaker.getMemento());
		System.out.println("\n=====恢复后的状态======");
		System.out.println(winNotice.getState());
		
	}
}
