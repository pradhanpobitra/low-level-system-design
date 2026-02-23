package designs.atm.denomination;

public class _500Handler extends DenominationHandler {

    public _500Handler(DenominationHandler next) {
        super(500, 10, next);
    }
}
