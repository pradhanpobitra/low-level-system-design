package patterns.adapter.client;

import patterns.adapter.adaptee.WeighingMachineAdapteeImpl;
import patterns.adapter.adapter.WeighingMachineAdapter;
import patterns.adapter.adapter.WeighingMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(new WeighingMachineAdapteeImpl());

        double weightInKilos = weighingMachineAdapter.getWeightInKilos();
        System.out.println("Weight in kilos is: " + weightInKilos);
    }
}
