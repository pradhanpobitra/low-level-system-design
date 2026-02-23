package designs.atm.state;

import designs.atm.AtmMachine;
import designs.atm.Card;
import designs.atm.operation.OperationProviderFactory;
import designs.atm.operation.OperationType;

public class Processing implements State {
    @Override
    public void insertCard(AtmMachine atmMachine, Card card) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ejectCard(AtmMachine atmMachine) {
        System.out.println("Ejecting Card");
        atmMachine.setInsertedCard(null);
        atmMachine.setStateType(StateType.IDLE);
    }

    @Override
    public boolean authenticate(AtmMachine atmMachine, String pin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void process(AtmMachine atmMachine, OperationType operationType) {
        OperationProviderFactory.getOperation(operationType).process(atmMachine);
    }
}
