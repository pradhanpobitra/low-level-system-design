package designs.atm.state;

import designs.atm.AtmMachine;
import designs.atm.Card;
import designs.atm.operation.OperationType;

public class Authenticating implements State {
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
        if(atmMachine.getInsertedCard() == null) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        boolean pinMatched = atmMachine.getInsertedCard().getPinCode().equals(pin);
        if(pinMatched) {
            System.out.println("PIN MATCHED, now choose operation");
            atmMachine.setStateType(StateType.PROCESSING);
            return true;
        }
        System.out.println("PIN NOT MATCHED, try again");
        return false;
    }

    @Override
    public void process(AtmMachine atmMachine, OperationType operationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
