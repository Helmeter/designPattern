package observe;
/**
 * Created by helmeter on 5/4/16.
 */
public class ConcreteSubject extends Subject {

    private String subjectState;
    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
      //  System.out.println("setSubjectState: " + subjectState);
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
