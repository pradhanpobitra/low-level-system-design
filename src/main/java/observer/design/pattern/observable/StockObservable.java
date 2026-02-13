package observer.design.pattern.observable;

import observer.design.pattern.observer.StockObserver;

public interface StockObservable {
    void registerObserver(StockObserver observer);

    void unregisterObserver(StockObserver observer);

    void notifyObservers();

    int getStockData();

    void setStockData(int stockData);
}
