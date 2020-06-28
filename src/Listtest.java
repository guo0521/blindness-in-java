import com.sun.javafx.UnmodifiableArrayList;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Listtest {

    public static void main(String[] args){
//        /*
//        add item to a list, then the hash of this list change
        List<String> list = new ArrayList<>();
        list.add("a");

        Set<List<String>> set = new HashSet<>();
        set.add(list);

        System.out.println(set.contains(list)); //true

        list.add("goodbye");

        System.out.println(set.contains(list)); //false, hash change
//         */


//        /*
//        缓存机制(Integer的-128~127) == and equals

        Map<String, Integer> a = new HashMap<>(), b = new HashMap<>();
        a.put("c", 130);
        b.put("c", 130);
        System.out.println(a.get("c").equals(b.get("c")));//true

        System.out.println(a.get("c") == (b.get("c")));//false

        Integer x = new Integer(2);
        Integer y = new Integer(2);
        System.out.println(x == y);//false

        x = 2;
        y = 2;
        System.out.println(x == y);//true
//         */


//        /*
//        Test Collections.copy(? extends T, ? super T)

        List<Number> source = new LinkedList<>();
        source.add(Float.valueOf(3));
        source.add(Integer.valueOf(2));
        source.add(Double.valueOf(1.1));

        List<Number> size = new LinkedList<>();
        size.add(null);size.add(null);size.add(null);size.add(null);

        List<Object> dest = new LinkedList<>(size);

        Collections.copy(dest, source);

        System.out.println(source);//[3.0, 2, 1.1]
        System.out.println(dest);//[3.0, 2, 1,1, null]
//         */


//        /*
//        change unmodifiable collections

        List<String> lista = new ArrayList<>();
        lista.add("a");
        String ba = "b";
        lista.add(ba);
        List<String> numbers = Collections.unmodifiableList(lista);
        System.out.println(numbers);//[a, b]
        lista.set(0, "c");
        System.out.println(numbers);//[c,b]
//         */

//        /*
//        test greedy, reluctant and possessive
        Pattern pattern = Pattern.compile(".*+foo");
        String string = "xfooxxxxxxfoo";
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()){
            System.out.println(matcher.group());
        }
//         */

        System.out.println(decision());

    }

//    help to test try and finally
    private static boolean decision(){
        try{
            return true;
        }finally {
            return false;
        }
    }
}
