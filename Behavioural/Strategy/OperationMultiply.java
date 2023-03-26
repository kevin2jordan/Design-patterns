package DesignPatterns.Behavioural.Strategy;

public class OperationMultiply implements Strategy {


    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }

    public static interface Strategy {
        public int doOperation(int num1, int num2);
    }
}
