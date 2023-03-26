package DesignPatterns.Creational.Builder;

public class Runner {
    public static void main(String[] args) {

        User user = new User.Builder()
                .phoneNumber("9709896757")
                .name("Rahul Kumar")
                .email("r970ahul@gmail.com")
                .age(25)
                .address("Patna")
                .build();

        System.out.println(user.toString());

       // System.out.println(user1);
        /*
        1) backward compatibility
        2) Flexible object creation (can create object of required attributes only)
        3) Doesn't need to maintain insertion order
         */
    }
}
