package factoryPatternExample;

public class HLD extends AbstractCourse{
    @Override
    public void createCourse() {
        moduleList.add((AbstractModule) new IntroModule());
        moduleList.add(new ConceptModule());
        moduleList.add(new SummaryModule());
    }
}
