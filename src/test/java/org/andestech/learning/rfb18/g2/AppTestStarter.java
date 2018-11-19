package org.andestech.learning.rfb18.g2;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AppTestStarter
{

    @Test
    public void testAnswerWithTrue(){

    assertTrue(1==2);

    assertTrue(2==2);

    }


    @Test
    //@Ignore
    public void testAnswerWithTrue2(){

        int a=1, b=2;
        assertTrue(1==1);

        a = 1/(b-3);

        assertTrue(2==2);

    }


    @Test
    public void testLogin(){

    String login = "   basil_the_wolf96 ";
    //...
    //...
    Login login1 = new Login(login,"");

    assertTrue("Не верное приведение логина пользователя...",
            login1.getuLogin().equals("BASIL_THE_WOLF96") );

    }
//
//    @Test
//    public void testValidPasswords() throws PasswordException {
//        Login login1 = new Login("Kate","fdfqr");
//        login1.verify();
//
//
//    }


    @Test
    public void testValidPasswords()  {
        Login login1 = new Login("Kate","fdfqr");

       try { login1.verify();}
       catch (PasswordException ex) {
           assertTrue("Password test failed: " + ex.getMessage(), false);
       }


    }


    @Test(expected = PasswordException.class)
    public void testInvalidPasswords() throws PasswordException {
        Login login1 = new Login("Kate","uwqr");
        login1.verify();


    }


}
