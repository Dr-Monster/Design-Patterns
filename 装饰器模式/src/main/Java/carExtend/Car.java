package carExtend;

import carInterface.ICommonCar;

public class Car implements ICommonCar {
    @Override
    public void carMove() {
        System.out.println("Land Drive...");
    }
}
