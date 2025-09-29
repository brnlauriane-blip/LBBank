package components.accounts.types;

//1.2.2 Creation of the (CurrentAccount and) SavingsAccount

import components.Client;
import components.accounts.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(Client client) {
        super("Savings Account", client);
    }
}
