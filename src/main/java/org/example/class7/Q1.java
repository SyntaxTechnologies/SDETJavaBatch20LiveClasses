package org.example.class7;

/*
Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”

 */

public class Q1 {
    public static void main(String[] args) {

        String userName="User123";
        String password="pass123";
        String confirmPassword="pass123";

        if(userName.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
        }

    }
}
