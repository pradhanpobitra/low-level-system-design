package patterns.observer;

import patterns.observer.observable.IphoneStockObservable;
import patterns.observer.observable.StockObservable;
import patterns.observer.observer.EmailIphoneStockObserver;
import patterns.observer.observer.MobileIphoneStockObserver;
import patterns.observer.observer.StockObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        StockObserver emailStockObserver = new EmailIphoneStockObserver("ppradhan@gmail.com", iphoneStockObservable);
        StockObserver mobileStockObserver = new MobileIphoneStockObserver("6000188238", iphoneStockObservable);

        iphoneStockObservable.registerObserver(emailStockObserver);
        iphoneStockObservable.registerObserver(mobileStockObserver);

        iphoneStockObservable.setStockData(10);
        iphoneStockObservable.setStockData(0);

        iphoneStockObservable.unregisterObserver(emailStockObserver);

        iphoneStockObservable.setStockData(200);
    }
}
