package designs.atm.state;

import designs.atm.AtmMachine;
import designs.atm.Card;
import designs.atm.operation.OperationType;

public class Noop implements State{
    @Override
    public void insertCard(AtmMachine atmMachine, Card card) {

    }

    @Override
    public void ejectCard(AtmMachine atmMachine) {

    }

    @Override
    public boolean authenticate(AtmMachine atmMachine, String pin) {
        return false;
    }

    @Override
    public void process(AtmMachine atmMachine, OperationType operationType) {

    }
}
