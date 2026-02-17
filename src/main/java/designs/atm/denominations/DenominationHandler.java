package designs.atm.denominations;

import java.util.Map;

public abstract class DenominationHandler {
    private final DenominationHandler nextdenominationHandler;
    private final DenominationType denominationType;
    private int availableCount;

    public DenominationHandler(DenominationHandler nextDenominationHandler,
                               DenominationType denominationType,
                               int  availableCount) {
        this.nextdenominationHandler = nextDenominationHandler;
        this.denominationType = denominationType;
        this.availableCount = availableCount;
    }

    public boolean handleRequest(int amount, Map<DenominationType, Integer> notes) {
        int consumableCount = getNotesToBeConsumed(amount);
        if(consumableCount > 0) {
            notes.put(denominationType, consumableCount);
            amount = amount - consumableCount * denominationType.value;
        }

        boolean canBeFullfilled = true;

        if (nextdenominationHandler == null && amount > 0) {
            notes.clear();
            canBeFullfilled = false;
        } else if(amount > 0) {
            canBeFullfilled = nextdenominationHandler.handleRequest(amount, notes);
        }

        if(canBeFullfilled) {
            availableCount -= consumableCount;
        }
        return canBeFullfilled;
    }

    private Integer getNotesToBeConsumed(int amount) {
        int required = amount / denominationType.value;
        return Integer.min(required, availableCount);
    }
}
