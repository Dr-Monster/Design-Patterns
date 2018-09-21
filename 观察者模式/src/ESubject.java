import java.util.ArrayList;
import java.util.List;

public class ESubject implements ISubject {
    List<IObserver> iObList = new ArrayList<>();

    @Override
    public void attachOB(IObserver iObserver) {
        iObList.add(iObserver);
    }

    @Override
    public void detachOB(IObserver iObserver) {
        if (iObList.contains(iObserver)) {
            iObList.remove(iObserver);
        }
    }

    @Override
    public void notifyOB() {
        for (IObserver observer : iObList) {
            observer.setResult("OB_ Info");
        }
    }
}
