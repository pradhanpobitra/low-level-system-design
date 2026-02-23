package designs.atm.state;

import designs.atm.AtmMachine;
import designs.atm.Card;
import designs.atm.operation.OperationType;


public interface State {
    void insertCard(AtmMachine atmMachine, Card card);

    void ejectCard(AtmMachine atmMachine);

    boolean authenticate(AtmMachine atmMachine, String pin);

    void process(AtmMachine atmMachine, OperationType operationType);
}
