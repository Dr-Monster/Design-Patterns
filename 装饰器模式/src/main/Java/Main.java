import carExtend.Car;
import carExtend.FlyCar;
import carExtend.SwimCar;
import carInterface.CarImpl;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("增加新的功能：飞行");
        FlyCar flycar = new FlyCar(car);
        flycar.carMove();

        System.out.println("增加新的功能：水里游");
        SwimCar waterCar = new SwimCar(car);
        waterCar.carMove();

        System.out.println("增加两个新的功能，飞行，水里游");
        SwimCar waterCar2 = new SwimCar(new FlyCar(car));
        waterCar2.carMove();
    }
}
