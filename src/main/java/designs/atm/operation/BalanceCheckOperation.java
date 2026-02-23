package designs.atm.operation;

import designs.atm.AtmMachine;

public class BalanceCheckOperation implements Operation {
    @Override
    public void process(AtmMachine atmMachine) {
        System.out.println("Card balance: " + atmMachine.getInsertedCard().getBankBalance());
    }
}
