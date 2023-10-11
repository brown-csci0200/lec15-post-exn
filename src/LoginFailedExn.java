package src;

public class LoginFailedExn extends Exception {
    public String custname;

    public LoginFailedExn(String n) {
        this.custname = n;
    }
}
