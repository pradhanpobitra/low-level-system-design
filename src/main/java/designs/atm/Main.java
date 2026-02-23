package designs.atm;

public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();
        Card card = new Card();
        card.setCardHolderName("Durlobh Saikia");
        card.setCardNumber("12345");
        card.setPinCode("1234");
        card.setBankBalance(15000);

        atmMachine.insertCard(card);

        while(!atmMachine.enterPin()) {}

        atmMachine.showOperations();

        atmMachine.processOperation();

        atmMachine.ejectCard();
    }
}
