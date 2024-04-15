/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account_1;

import javax.swing.JOptionPane;

/**
 *
 * @author lakha
 * 
 */
public class Login_
{
 private String username;
 private String password;
 private String Name;
 private String Surname;

    public Login_ (String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.Name = firstName;
        this.Surname = lastName;
    }

 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return Name;
    }

    public void setFirstName(String firstName) {
        this.Name = firstName;
    }

    public String getLastName() {
        return Surname;
    }

    public void setLastName(String lastName) {
        this.Surname = lastName;
    }

    
 
    
    

    public  boolean checkUserName(String username){
        if(username.contains("_")&& username.length() <=5){ //check to see if the username less than 5 characters and has an underscore
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.",
            "False", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    
    public  boolean checkPasswordComplexity(String password){
        if (password.length() >= 8 && //check if the password meets requirements
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@%#$^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")){
                return true;
        }else{
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.",
             "False", JOptionPane.ERROR_MESSAGE);
              return false;
            
          /*
              title:checkPasswordComplexity
              Author: OpenAI (Provided by chat gpt)
              Date: 9 April 2024
              code version: 1
              Availability: OpenAI
          */
        }
    }
    
    
    
    public  String registerUser(){


        if (checkUserName(username) && checkPasswordComplexity(password)) {
             JOptionPane.showMessageDialog(null,"User registered successfully.");
 
        }else{

        } 
            JOptionPane.showMessageDialog(null,"User registered successfully.");
     return null;
    }
            
    
    
   public  void loginUser(String username, String password){
String username2 = JOptionPane.showInputDialog("Enter username:");
String password2 = JOptionPane.showInputDialog("Enter password:");

if (username2.equals(username) && password2.equals(password)){
JOptionPane.showMessageDialog(null, "Welcome" + username + ", it is great to see you again.",
"True", JOptionPane.INFORMATION_MESSAGE);
}else{
JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again",
"False", JOptionPane.ERROR_MESSAGE);

   }

    }

   
       //method to verify login
    public String returnLoginStatus(String enteredUsername, String enteredPassword){
        if (enteredUsername.equals(username) && enteredPassword.equals(password)){
        return "Successful login";
}else{
        return "Failed login";
    }
    }
    
    
    
}

