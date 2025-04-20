package abstractfactorypatternexample;

public class ApjCollegeFeeCalculator extends AbstractFeeCalculator{
    @Override
    public int calculateFee() {
        return 10000;
    }
}
