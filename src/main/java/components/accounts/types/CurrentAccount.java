package components.accounts.types;

//1.2.2 Creation of the CurrentAccount (and SavingsAccount)

import components.Client;
import components.accounts.Account;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super("Current Account", client);
    }
}
