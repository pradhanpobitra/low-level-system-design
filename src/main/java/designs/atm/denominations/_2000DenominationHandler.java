package designs.atm.denominations;

public class _2000DenominationHandler extends DenominationHandler {

    public _2000DenominationHandler(DenominationHandler nextDenominationHandler, int availableCount) {
        super(nextDenominationHandler, DenominationType.TWO_THOUSAND, availableCount);
    }
}
