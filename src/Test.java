import java.util.*;

public class Test {

    private final List<String> testList = new ArrayList<>();

    public List<String> getTestList() {
        return testList;
    }

    public void add(String item){
        testList.add(item);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.add("I am Bob");
        test.add("Who are you?");
        System.out.println(test.getTestList());
    }
    
}
