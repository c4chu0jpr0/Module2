package PackageWord;

import java.io.Serializable;
import java.util.List;

public class Type_Word implements Serializable {
    private String name;
    List<Meaning> mean;

    public Type_Word(String name, List<Meaning> mean) {
        this.name = name;
        this.mean = mean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Meaning> getExamples() {
        return mean;
    }

    public void setExamples(List<Meaning> examples) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return  name + "\n" +
                mean;
    }
}
