package abstractfactorypatternexample;

public abstract class UniversityFactory {

    private static final int CUTTOFF = 109;

    public static UniversityFactory getUniversityFactory(int score){
        if(score > CUTTOFF) return new IvyLeagueUniversityFactory();
        else return  new PublicUniversityFactory();
    }

    public abstract AbstractAdmitCard getAdmitCard(String course);
    public abstract AbstractFeeCalculator calculateFee(String course);

}
