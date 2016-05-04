package observe.JDk;

import java.util.Observable;

/**
 * Created by helmeter on 5/4/16.
 */
public class NewsPaper extends Observable {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(this.content);
    }
}
