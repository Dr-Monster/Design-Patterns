import obInterface.IUsb;

public class UsbImpl implements IUsb {
    @Override
    public void use() {
        System.out.println("Usb Interface...");
    }
}
