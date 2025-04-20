package abstractfactorypatternexample;

public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AbstractAdmitCard getAdmitCard(String course) {
        if(course.equals(CourseTypes.CS)) return new FsuCollegeAdmitCard();
        else if(course.equals(CourseTypes.LAW)) return new AsuCollegeAdmitCard();
        else return null;
    }

    @Override
    public AbstractFeeCalculator calculateFee(String course) {
        if(course.equals(CourseTypes.CS)) return new FsuCollegeFeeCalculator();
        else if(course.equals(CourseTypes.LAW)) return new AsuCollegeFeeCalculator();
        return null;
    }
}
