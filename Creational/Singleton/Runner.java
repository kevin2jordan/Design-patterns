package DesignPatterns.Creational.Singleton;

public class Runner {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance 1 " + instance1.hashCode());
        System.out.println("instance 2 " + instance2.hashCode());

        String str = new String();
        String str2 = new String("test");
        System.out.println(str + "  " + str2);

    }
}
