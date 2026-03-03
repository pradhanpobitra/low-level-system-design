package patterns.adapter.adaptee;

public class WeighingMachineAdapteeImpl implements WeighingMachineAdaptee {
    @Override
    public double getWeightInPounds() {
        return 50.0;
    }
}
