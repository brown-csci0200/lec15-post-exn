import java.util.LinkedList;

public class CustomerList {
    private LinkedList<Customer> customers = new LinkedList<Customer>();

    public Customer addCustomer(String username, String pwd) {
        Customer newC = new Customer(username, pwd);
        customers.add(newC);
        return newC;
    }

    public Customer findCustomer(String custname) throws CustNotFoundExn{
        for (Customer cust:customers) {
            if (cust.nameMatches(custname)) {
                return cust;
            }
        }
        throw new CustNotFoundExn(custname); // instead of returning null
    }
}
