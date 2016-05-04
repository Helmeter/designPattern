package state;

/**
 * Created by helmeter on 5/4/16.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String para) {
        state.handle(para);
    }
}
