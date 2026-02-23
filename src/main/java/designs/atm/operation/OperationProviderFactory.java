package designs.atm.operation;

public class OperationProviderFactory {

    public static Operation getOperation(OperationType  operationType) {
        switch (operationType) {
            case WITHDRAWAL -> {
                return new WithdrawalOperation();
            }
            case CHECK_BALANCE -> {
                return new BalanceCheckOperation();
            }
            case null, default -> {
                return  new Noop();
            }
        }
    }
}
