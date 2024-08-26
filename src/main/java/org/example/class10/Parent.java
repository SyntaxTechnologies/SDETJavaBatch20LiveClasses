package org.example.class10;

public  class Parent {

   void marry(){
        System.out.println("Marry the girl that we choose for you");
    }
    void eat(){
        System.out.println("Parents like to Eat Fish");
    }
}

class Fahad extends Parent {

    @Override
   public void marry() {
        System.out.println("I want to Marry taylor swift");
    }
}

class FahadTester{
    public static void main(String[] args) {
        Fahad f=new Fahad();
        f.marry();
    }
}