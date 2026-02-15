package patterns.observer.observable;

import patterns.observer.observer.StockObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    private int iphoneStockCount;
    private final List<StockObserver> stockObservers;

    public IphoneStockObservable() {
        iphoneStockCount = 0;
        stockObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        stockObservers.add(observer);
    }

    @Override
    public void unregisterObserver(StockObserver observer) {
        stockObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : stockObservers) {
            observer.update();
        }
    }

    @Override
    public int getStockData() {
        return iphoneStockCount;
    }

    @Override
    public void setStockData(int stockData) {
        if(iphoneStockCount == 0) {
            notifyObservers();
        }
        iphoneStockCount = stockData;
    }
}
