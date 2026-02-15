package patterns.observer.observer;

import patterns.observer.observable.StockObservable;

public class MobileIphoneStockObserver implements StockObserver {

    private final String mobileNumber;
    private final StockObservable stockObservable;

    public MobileIphoneStockObserver(String mobileNumber, StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update() {
        stockObservable.getStockData();
        System.out.println("Sending the status update to: " + mobileNumber);
    }
}
