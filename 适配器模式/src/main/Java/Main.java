import obInterface.IPsp;
import obInterface.IUsb;
import tools.Adapter;

public class Main {

    public static void main(String[] args) {
        IPsp iPsp = new Adapter(new UsbImpl());
        iPsp.use();
    }
}
