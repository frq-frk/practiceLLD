package abstractfactorypatternexample;

public class Demo {
    public static void main(String[] args) {
        int score = 96;
        UniversityFactory abstractUniFactory = UniversityFactory.getUniversityFactory(score);

        AbstractAdmitCard admitCard = abstractUniFactory.getAdmitCard(CourseTypes.CS);
        System.out.println(admitCard.getAdmitCard());

        AbstractFeeCalculator feeCalculator = abstractUniFactory.calculateFee(CourseTypes.CS);
        System.out.println(feeCalculator.calculateFee());

        score = 135;

        UniversityFactory abstractUniFactory2 = UniversityFactory.getUniversityFactory(score);

        AbstractAdmitCard admitCard2 = abstractUniFactory2.getAdmitCard(CourseTypes.LAW);
        System.out.println(admitCard2.getAdmitCard());

        AbstractFeeCalculator feeCalculator2 = abstractUniFactory2.calculateFee(CourseTypes.LAW);
        System.out.println(feeCalculator2.calculateFee());

    }
}
