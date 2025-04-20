package abstractfactorypatternexample;

public class PublicUniversityFactory extends UniversityFactory{
    @Override
    public AbstractAdmitCard getAdmitCard(String course) {
        if(course.equals(CourseTypes.MATH)) return new YsrCollegeAdmitCard();
        else if(course.equals(CourseTypes.CS)) return new ApjCollegeAdmitCard();
        else return null;
    }

    @Override
    public AbstractFeeCalculator calculateFee(String course) {
        if(course.equals(CourseTypes.MATH)) return new YsrCollegeFeeCalculator();
        else if(course.equals(CourseTypes.CS)) return new ApjCollegeFeeCalculator();
        else return null;
    }
}
