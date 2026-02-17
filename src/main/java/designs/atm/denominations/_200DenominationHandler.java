package designs.atm.denominations;

public class _200DenominationHandler extends DenominationHandler {

    public _200DenominationHandler(DenominationHandler nextDenominationHandler, int availableCount) {
        super(nextDenominationHandler, DenominationType.TWO_HUNDRED, availableCount);
    }
}
