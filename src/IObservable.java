import java.beans.PropertyChangeListener;

/**
 * Created by Sara on 2016-12-01.
 */
public interface IObservable {

    public void addObserver(PropertyChangeListener observer);

    public void removeObserver(PropertyChangeListener observer);

}
