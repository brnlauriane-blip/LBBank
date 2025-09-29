package components.flows.typeofflows;

//1.3.3 Creation of the (Transfer,) Credit, (Debit) classs

import components.flows.Flow;

public class Credit extends Flow {

    public Credit(String comment, double amount, int targetAccountNumber) {
        super(comment, amount, targetAccountNumber);

    }

}
