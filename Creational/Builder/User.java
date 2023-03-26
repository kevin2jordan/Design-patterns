package DesignPatterns.Creational.Builder;

public class User {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private final int age;

    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
        this.address = builder.address;;
    }

    public void createSession() {

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static class Builder {
        private String name;
        private String email;
        private String phoneNumber;
        private int age;
        private String address;

        public Builder(){};

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
