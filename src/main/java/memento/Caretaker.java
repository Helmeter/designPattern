package memento;

/**
 * Created by helmeter on 5/4/16.
 */
public class Caretaker {
	
	//备忘录对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
