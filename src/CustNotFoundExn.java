public class CustNotFoundExn extends Exception {
    public String custname;

    public CustNotFoundExn(String n) {
        this.custname = n;
    }
}
