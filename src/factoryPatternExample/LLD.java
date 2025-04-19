package factoryPatternExample;

public class LLD extends AbstractCourse{

    @Override
    public void createCourse() {
        moduleList.add((AbstractModule) new IntroModule());
        moduleList.add(new ExerciseModule());
        moduleList.add(new SummaryModule());
    }
}
