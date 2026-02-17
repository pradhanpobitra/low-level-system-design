package designs.atm.denominations;

public class _100DenominationHandler extends DenominationHandler {

    public _100DenominationHandler(DenominationHandler nextDenominationHandler, int availableCount) {
        super(nextDenominationHandler, DenominationType.ONE_HUNDRED, availableCount);
    }
}
