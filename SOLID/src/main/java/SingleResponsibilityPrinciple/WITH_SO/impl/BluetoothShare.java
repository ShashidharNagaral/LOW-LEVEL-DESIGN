package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.ShareStrategy;

public class BluetoothShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Share using device bluetooth API");
    }
}
