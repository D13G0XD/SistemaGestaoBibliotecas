package entities;

import java.time.LocalDate;

public class User {

    private String name;
    private int age;
    private LocalDate registerDate;
    private String id;

    public User(String name, int age, String id, LocalDate registerDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuário: " + name + "Idade: " + age + "Registro: " + registerDate + "ID: " + id;
    }
}
