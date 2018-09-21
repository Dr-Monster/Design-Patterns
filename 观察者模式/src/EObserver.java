import java.sql.SQLOutput;

public class EObserver implements IObserver {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public EObserver(String name) {
        this.name = name;
    }

    @Override
    public void setResult(String info) {
        System.out.println("Name:" + name);
        System.out.println("Info:" + info);
    }
}
