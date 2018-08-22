
package carExtend;

import carInterface.CarImpl;
import carInterface.ICommonCar;

public class FlyCar extends CarImpl {

    public FlyCar(ICommonCar iCommonCar) {
        super(iCommonCar);
    }

    @Override
    public void carMove() {
        super.carMove();
        flyMove();
    }

    public void flyMove(){
        System.out.println("Fly Drive...");
    }
}
