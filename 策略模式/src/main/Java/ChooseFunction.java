package main.Java;

import main.Java.chooseRoute.IFunction;

public class ChooseFunction {
    private IFunction iFunction ;

    public ChooseFunction(IFunction iFunction) {
        this.iFunction = iFunction;
    }

    public void chooseFunction(){
        iFunction.run();
    }
}
