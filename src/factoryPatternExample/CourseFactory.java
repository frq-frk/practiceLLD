package factoryPatternExample;

public class CourseFactory {
    private CourseFactory(){}
    public static AbstractCourse getCourse(String courseType){
        if(courseType.equals(CourseTypes.HLD)){
            return new HLD();
        }else if(courseType.equals(CourseTypes.LLD)){
            return new LLD();
        }
        return null;
    }
}
