package designs.carrental.returns;

import designs.carrental.store.MumbaiStore;

public class MumbaiReturnManager extends ReturnManager {

    public MumbaiReturnManager() {
        super(MumbaiStore.getInstance());
    }
}
