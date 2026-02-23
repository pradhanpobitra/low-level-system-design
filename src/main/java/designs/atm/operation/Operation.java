package designs.atm.operation;

import designs.atm.AtmMachine;

public interface Operation {

    void process(AtmMachine atmMachine);
}
