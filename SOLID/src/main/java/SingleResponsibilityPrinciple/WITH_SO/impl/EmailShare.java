package SingleResponsibilityPrinciple.WITH_SO.impl;

import SingleResponsibilityPrinciple.WITH_SO.ShareStrategy;

public class EmailShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Share through Email");
    }
}
