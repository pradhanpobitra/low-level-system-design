package designs.atm;

public class Card {
    String pinCode;
    String cardNumber;
    String cardHolderName;
    Integer bankBalance;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Integer getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(Integer bankBalance) {
        this.bankBalance = bankBalance;
    }
}
