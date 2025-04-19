package factoryPatternExample;

public class Demo {
    public static void main(String[] args) {
        AbstractCourse hld = CourseFactory.getCourse(CourseTypes.HLD);
        AbstractCourse lld = CourseFactory.getCourse(CourseTypes.LLD);

        if(hld != null){
            System.out.println("HLD MOdules : ");
            System.out.println(hld.getModuleList());
        }
        if(lld != null){
            System.out.println("LLD MOdules : ");
            System.out.println(lld.getModuleList());
        }
    }
}
