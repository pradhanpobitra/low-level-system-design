package designs.atm;

import designs.atm.denominations.*;

import java.util.HashMap;
import java.util.Map;

public class AtmMachine {
    private final DenominationHandler denominationHandlerChain;

    public AtmMachine() {
        denominationHandlerChain =
                new _2000DenominationHandler(
                    new _500DenominationHandler(
                        new _200DenominationHandler(
                            new _100DenominationHandler(null, 10),
                                6),
                            5),
                        2);
    }

    public void withdrawMoney(int amount) {
        Map<DenominationType, Integer> map = new HashMap<>();
        boolean isRequestFulfilled = denominationHandlerChain.handleRequest(amount, map);

        if(!isRequestFulfilled) {
            System.out.println("Sorry, ATM does not contain enough money for amount: " + amount);
        } else {
            System.out.println("Successfully withdrawn money: " + amount);
            for(Map.Entry<DenominationType, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
