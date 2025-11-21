package com.cc.java;

public class Cat {

    // Eigenschaften / Felder / Attribute
    private String firstName;
    private String furColor;
    private int age; // kleingeschriebene Datentypen haben keine Klassen / Primitives

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }
// getter
    public String getFirstName() {
        return firstName;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    // return der Instanzvariablen / Adresse
    public Cat getInstanceVariable(){
       return this;
    }
    
}
