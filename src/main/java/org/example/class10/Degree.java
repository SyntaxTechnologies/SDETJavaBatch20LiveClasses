package org.example.class10;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree{

}
class Masters extends Degree {
    void getPrerequisites(){
        System.out.println("To get a degree you need high school diploma");
    }

    public static void main(String[] args) {
        Masters m=new Masters();
        m.getPrerequisites();
    }
}