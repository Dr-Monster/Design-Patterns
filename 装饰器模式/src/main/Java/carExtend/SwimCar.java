package carExtend;

import carInterface.CarImpl;
import carInterface.ICommonCar;

public class SwimCar extends CarImpl {
    public SwimCar(ICommonCar iCommonCar) {
        super(iCommonCar);
    }

    @Override
    public void carMove() {
        super.carMove();
        swimMove();
    }

    public void swimMove(){
        System.out.println("Swim Drive...");
    }
}
