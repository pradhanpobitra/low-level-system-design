package designs.atm.state;

import designs.atm.AtmMachine;
import designs.atm.Card;
import designs.atm.operation.OperationType;


public class Idle implements State {
    @Override
    public void insertCard(AtmMachine atmMachine, Card card) {
        System.out.println("Inserting card");
        atmMachine.setInsertedCard(card);
        atmMachine.setStateType(StateType.AUTHENTICATING);
    }

    @Override
    public void ejectCard(AtmMachine atmMachine) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean authenticate(AtmMachine atmMachine, String pin) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void process(AtmMachine atmMachine, OperationType operationType) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }
}
