package designs.atm;

public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        atmMachine.withdrawMoney(5000);
        atmMachine.withdrawMoney(1000);
        atmMachine.withdrawMoney(2000);
        atmMachine.withdrawMoney(30000);
        atmMachine.withdrawMoney(4000);
        atmMachine.withdrawMoney(500);
    }
}
