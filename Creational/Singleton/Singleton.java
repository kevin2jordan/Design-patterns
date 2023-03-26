package DesignPatterns.Creational.Singleton;

public class Singleton {

    /*

   // Early initialization technique

    private static final Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("instance info " + instance.hashCode());
    }

    public static Singleton getInstance() {
        return instance;
    }


    Lazy initialization technique

    private static Singleton instance = null;

    private Singleton(){};

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

     */

    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/*
static keyword
1) method
2) variable
3) Class
 */

