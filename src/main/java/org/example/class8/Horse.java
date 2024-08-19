package org.example.class8;

public class Horse {
    private String name;
    int age;
  public   String breed;

    private void printName() {
        System.out.println(name);
    }

   public void printAge() {
        System.out.println(age);
    }

    void printBreed() {
        System.out.println(breed);
    }

    public static void main(String[] args) {
        Horse h = new Horse();
        h.name = "ted";
        h.age = 15;
        h.breed = "british";
        h.printName();
        h.printAge();
        h.printBreed();

    }
}

