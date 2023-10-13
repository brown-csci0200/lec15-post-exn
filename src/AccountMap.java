package src;

import java.util.HashMap;

public class AccountMap {
    private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    AccountMap(){}

    public int addAccount(Customer cust, double balance) {
        int newID = accounts.size() + 1;
        Account a = new Account(newID, cust, balance);

        //accounts.add(a); // LIST VERSION

        return newID;
    }

    public Account findAccount(int forAcctNum) {
//        for (Account acct:accounts) { // LIST VERSION
//            if (acct.numMatches(forAcctNum))
//                return acct;
//        }
        return null;
    }
}
