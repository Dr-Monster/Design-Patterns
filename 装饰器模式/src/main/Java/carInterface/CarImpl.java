package carInterface;

public class CarImpl implements ICommonCar {

    ICommonCar iCommonCar;

    public CarImpl(ICommonCar iCommonCar) {
        this.iCommonCar = iCommonCar;
    }

    @Override
    public void carMove() {
        iCommonCar.carMove();
    }
}
