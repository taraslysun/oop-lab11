package main.java.ua.edu.ucu.apps;

/*Client
id (this parameter should be assigned automatically in order from 0);
name;
age;
sex; */

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Client {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex){
        id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}