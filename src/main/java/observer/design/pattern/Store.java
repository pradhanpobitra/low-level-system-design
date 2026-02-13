package observer.design.pattern;

import observer.design.pattern.observable.IphoneStockObservable;
import observer.design.pattern.observable.StockObservable;
import observer.design.pattern.observer.EmailIphoneStockObserver;
import observer.design.pattern.observer.MobileIphoneStockObserver;
import observer.design.pattern.observer.StockObserver;

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
