package src;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // set up components (options would be chosen here)
        AccountList accounts = new AccountList();    // part of model
        CustomerList customers = new CustomerList(); // part of model
        BankingService controller = new BankingService(accounts, customers);
        BankingConsole view = new BankingConsole(controller);

        // set up initial data in the model
        Customer kCust = customers.addCustomer("kathi", "cs200");
        int kAcctNum = accounts.addAccount(kCust, 150);

        // interact with the bank
        view.loginScreen();
        view.showBalance(kAcctNum);
        view.withdraw(kAcctNum, 30);
        view.showBalance(kAcctNum);
    }


    public void hashMapExample() {
        // Map lab times to room numbers
        HashMap<String, String> labRooms = new HashMap<String, String>();

        // Associate this key with this value
        labRooms.put("Mon 4-6", "CIT219");
        labRooms.put("Tue 6-8", "CIT501");

        labRooms.get("Mon 4-6"); // Returns "CIT219"

        // Changes the value mapped to this key
        labRooms.put("Mon 4-6", "CIT444");  //
        labRooms.get("Mon 4-6");

        labRooms.get("Wed 8-10"); //

        if(labRooms.containsKey("Mon 4-6")) {
            // . . .
        }



    }
}
