package factoryPatternExample;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCourse {
    List<AbstractModule> moduleList = new ArrayList<>();

    AbstractCourse(){
        this.createCourse();
    }

    public List<AbstractModule> getModuleList() {
        return moduleList;
    }

    public abstract void createCourse();
}
