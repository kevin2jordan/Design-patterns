package DesignPatterns.Behavioural.Strategy;

public class Runner {
    public static void main(String[] args) {

        System.out.println(new Context(new OperationAdd()).executeStrategy(2,3));

        System.out.println(new Context(new OperationMultiply()).executeStrategy(3,4));

        System.out.println(new Context(new OperationSubtract()).executeStrategy(4,1));
    }
}
