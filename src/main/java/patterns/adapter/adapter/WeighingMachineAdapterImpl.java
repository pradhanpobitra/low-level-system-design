package patterns.adapter.adapter;

import patterns.adapter.adaptee.WeighingMachineAdaptee;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {

    private final WeighingMachineAdaptee weighingMachineAdaptee;

    public WeighingMachineAdapterImpl(WeighingMachineAdaptee weighingMachineAdaptee) {
        this.weighingMachineAdaptee = weighingMachineAdaptee;
    }

    @Override
    public double getWeightInKilos() {
        return 0.45 * weighingMachineAdaptee.getWeightInPounds();
    }
}
