package patterns.observer.observable;

import patterns.observer.observer.StockObserver;

public interface StockObservable {
    void registerObserver(StockObserver observer);

    void unregisterObserver(StockObserver observer);

    void notifyObservers();

    int getStockData();

    void setStockData(int stockData);
}
