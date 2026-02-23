package designs.atm.denomination;

public class _2000Handler extends DenominationHandler{
    public _2000Handler(DenominationHandler next) {
        super(2000, 2, next);
    }
}
