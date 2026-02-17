package designs.atm.denominations;

public enum DenominationType {
    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    TWO_HUNDRED(200),
    ONE_HUNDRED(100),
    ;

    public final int value;
    DenominationType(int value) {
        this.value = value;
    }
}
