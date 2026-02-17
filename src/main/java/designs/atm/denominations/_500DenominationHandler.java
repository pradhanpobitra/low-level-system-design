package designs.atm.denominations;

public class _500DenominationHandler extends DenominationHandler {

    public _500DenominationHandler(DenominationHandler nextDenominationHandler, int availableCount) {
        super(nextDenominationHandler, DenominationType.FIVE_HUNDRED, availableCount);
    }
}
