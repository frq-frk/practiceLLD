package abstractfactorypatternexample;

public class AsuCollegeFeeCalculator extends AbstractFeeCalculator{
    @Override
    public int calculateFee() {
        return 45000;
    }
}
