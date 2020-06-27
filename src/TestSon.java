import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSon extends Test{

    public void add(String item) {
        super.add(item);
    }

    @Override
    public List<String> getTestList() {
        return null;
    }

    Set<Test> t = new HashSet<>();
}
