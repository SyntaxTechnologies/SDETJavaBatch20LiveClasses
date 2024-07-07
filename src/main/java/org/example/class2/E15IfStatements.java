package org.example.class2;

public class E15IfStatements {
    public static void main(String[] args) {


        // A B C ab c A a
      String name="JAMES";
       if(name.equals("james")){
           System.out.println(1);
       }else{
           System.out.println(2);
       }

        if("james".equals(name)){ // case sensitive
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        if("james".equalsIgnoreCase(name)){ // case sensitive
            System.out.println(1);
        }else{
            System.out.println(2);
        }


    }
}
