package org.andestech.learning.rfb18.g2;


public class Login {

    private final static int passMinLength = 7;


    public Login(String uLogin, String uPassword) {
        this.uLogin = uLogin.toUpperCase();
        this.uPassword = uPassword;
    }

    private String uLogin;

    public String getuLogin() {
        return uLogin;
    }

    public void setuLogin(String uLogin) {
        this.uLogin =  uLogin.trim().toUpperCase();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    private String uPassword;

    public boolean verify() throws PasswordException {
        //.....
        System.out.println("Login: " + uLogin +
                ", Password:" + uPassword);

        if(uPassword.length() < passMinLength)
            throw new PasswordException("Password length violation: " + uPassword.length());
        //...
        return false;

    }

}
