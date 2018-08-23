package main.Java;

import main.Java.EneityImpl.Car;
import main.Java.chooseRoute.IFunction;

public class main {
    public static void main(String[] args){
        IFunction iFunction = new Car();

        ChooseFunction chooseFunction = new ChooseFunction(iFunction);

        chooseFunction.chooseFunction();
    }
}

