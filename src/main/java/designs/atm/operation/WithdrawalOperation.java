package designs.atm.operation;

import designs.atm.AtmMachine;

import java.util.Scanner;

public class WithdrawalOperation implements Operation {
    @Override
    public void process(AtmMachine atmMachine) {
        System.out.println("Enter withdrawal amount");
        Scanner sc = new Scanner(System.in);
        Integer withdrawalAmount = Integer.parseInt(sc.nextLine());
        if(checkAmountFeasibleToBeWithdrawn(atmMachine, withdrawalAmount)) {
            atmMachine.getInsertedCard().setBankBalance(atmMachine.getInsertedCard().getBankBalance() - withdrawalAmount);
            atmMachine.setBalance(atmMachine.getBalance() - withdrawalAmount);
            System.out.println("Withdrawal successful of amount: " + withdrawalAmount);
            System.out.println("Notes withdrawn: ");
            atmMachine.handleDenominations(withdrawalAmount);
        } else {
            System.out.println("Withdrawal failed of amount: " + withdrawalAmount + ". Insufficient funds.");
        }
    }

    private boolean checkAmountFeasibleToBeWithdrawn(AtmMachine atmMachine, Integer withdrawalAmount) {
        if(atmMachine.getBalance() < withdrawalAmount) {
            return false;
        } else return atmMachine.getInsertedCard().getBankBalance() >= withdrawalAmount;
    }
}
