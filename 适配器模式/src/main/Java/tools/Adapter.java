package tools;

import obInterface.IPsp;
import obInterface.IUsb;

public class Adapter implements IPsp {

    private IUsb iUsb ;

    public Adapter(IUsb iUsb){
        this.iUsb = iUsb;
    }

    @Override
    public void use() {
        iUsb.use();
        System.out.println("PSP transport to USB...");
    }
}
