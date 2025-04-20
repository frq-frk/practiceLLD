package abstractfactorypatternexample;

public class FsuCollegeFeeCalculator extends AbstractFeeCalculator{
    @Override
    public int calculateFee() {
        return 50000;
    }
}
