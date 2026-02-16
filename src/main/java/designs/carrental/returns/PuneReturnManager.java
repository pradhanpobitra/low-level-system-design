package designs.carrental.returns;

import designs.carrental.store.PuneStore;

public class PuneReturnManager extends ReturnManager {

    public PuneReturnManager() {
        super(PuneStore.getInstance());
    }
}
