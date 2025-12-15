package model;

public class User {

    private String name;
    private int age;
    private String registerDate;

    public User(String name, int age, String registerDate) {
        this.name = name;
        this.age = age;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRegisterDate() {
        return registerDate;
    }
}
