package patterns.observer.observer;

import patterns.observer.observable.StockObservable;

public class EmailIphoneStockObserver implements StockObserver {
    private final String email;
    private final StockObservable stockObservable;

    public EmailIphoneStockObserver(String email, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        stockObservable.getStockData();
        System.out.println("Sending the status update to: " + email);
    }
}
