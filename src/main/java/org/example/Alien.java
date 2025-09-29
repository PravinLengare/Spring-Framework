package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    /*
    private Laptop lap ;
    private int age;
    private int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAge() {
        System.out.println("setter called");
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Alien(){
        System.out.println("Object Created !");
    }
    @ConstructorProperties({"age","lap","sal"})
    Alien(int age,Laptop lap,int sal){
        System.out.println("Constructor is getting called !");
        this.age = age;
        this.lap = lap;
        this.sal = sal;
    }
    public void code(){
        lap.compile();
        System.out.println("Coding !");
    }

     */

    // interface
    @Value("21")   // injecting value from outside
    private int age;
    //@Autowired    // Field Injection
    private Computer com ;


    private int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAge() {
       // System.out.println("setter called");
        return age;
    }


    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("Alien Object Created !");
    }

    public void code(){
        com.compile();
        System.out.println("Coding !");
    }

}
