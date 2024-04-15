
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package account_1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Login_Test {
    
    public Login_Test() {
    }
    Login_ login  = new Login_("","","", "");
  
   
    
    
    

    @Test
    public void testCheckUserNamePass() {
        boolean actual = login.checkUserName("Kyl_1");
        assertTrue(actual);
    }

     @Test
    public void testCheckUserNameFail() {
        boolean actual = login.checkUserName("Kyle!!!!!");
        assertFalse(actual);}
    
    
    
    @Test
    public void testCheckPasswordComplexityPass() {
         boolean actual = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(actual);}
    
    @Test
    public void testCheckPasswordComplexityFail() {
         boolean actual = login.checkPasswordComplexity("password");
        assertFalse(actual);}
    
    
    
    

    @Test
    public void testRegisterUser() {
    }

    
    
    
    @Test
    public void testLoginUser() {
    }

    
    
    
    @Test
    public void testReturnLoginStatus() {
    }
    
    
    
    
}
