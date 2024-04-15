/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account_1;

import javax.swing.JOptionPane;

/**
 *
 * @author lakha
 */
public class Account_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
//         registerUser(); //register a new user


String username = JOptionPane.showInputDialog("Enter username:");
String password = JOptionPane.showInputDialog("Enter password:");
String Name = JOptionPane.showInputDialog("Enter Name:");
String Surname = JOptionPane.showInputDialog("Enter Surname:"); 




          Login_ login = new Login_( username,  password,  Name,  Surname);
                  
          login.checkUserName(username);
          login.checkPasswordComplexity(password);
      //    login.registerUser();
          login.loginUser(username, password);
          login.returnLoginStatus(username, password);
          
         
         
         
         
        
      
    }





    
}
