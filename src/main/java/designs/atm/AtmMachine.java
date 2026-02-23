package designs.atm;

import designs.atm.denomination.DenominationHandler;
import designs.atm.denomination._100Handler;
import designs.atm.denomination._2000Handler;
import designs.atm.denomination._500Handler;
import designs.atm.operation.OperationProviderFactory;
import designs.atm.operation.OperationType;
import designs.atm.state.StateFactory;
import designs.atm.state.StateType;

import java.util.Arrays;
import java.util.Scanner;

public class AtmMachine {
    private StateType stateType;
    private Card insertedCard;
    private int balance;
    private final DenominationHandler denominationHandler;


    public void insertCard(Card card) {
        StateFactory.getState(stateType).insertCard(this, card);
    }

    public boolean enterPin() {
        System.out.println("Enter pin");
        Scanner scanner = new Scanner(System.in);
        String pin = scanner.nextLine();
        return StateFactory.getState(stateType).authenticate(this, pin);
    }

    public void showOperations() {
        System.out.println("Operations : ");
        Arrays.stream(OperationType.values()).toList().forEach(operationType ->
                System.out.println(operationType.toString()));
    }

    public void processOperation() {
        System.out.println("Enter operationType");
        Scanner scanner = new Scanner(System.in);
        String operationType = scanner.nextLine();
        OperationType operation = OperationType.valueOf(operationType);
        OperationProviderFactory.getOperation(operation).process(this);
    }

    public void ejectCard() {
        StateFactory.getState(stateType).ejectCard(this);
    }


    public AtmMachine() {
        this.stateType = StateType.IDLE;
        this.insertedCard = null;
        this.balance = 10000;
        this.denominationHandler = new _2000Handler(new _500Handler(new _100Handler(null)));
    }

    public void handleDenominations(int amount) {
        denominationHandler.handle(amount);
    }

    public void setStateType(StateType stateType) {
        this.stateType = stateType;
    }

    public Card getInsertedCard() {
        return insertedCard;
    }

    public void setInsertedCard(Card insertedCard) {
        this.insertedCard = insertedCard;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}