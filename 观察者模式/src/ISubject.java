import java.util.ArrayList;
import java.util.List;

public interface ISubject {

    public void attachOB(IObserver iObserver);

    public void detachOB(IObserver iObserver);

    public void notifyOB();
}
