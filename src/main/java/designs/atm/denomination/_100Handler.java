package designs.atm.denomination;

public class _100Handler extends DenominationHandler{
    public _100Handler(DenominationHandler next) {
        super(100, 20, next);
    }
}
