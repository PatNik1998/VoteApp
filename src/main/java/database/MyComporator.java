package database;

import java.util.Comparator;
import java.util.Map;

public class MyComporator implements Comparator<Map.Entry<String,Integer>> {
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        return o1.getValue().compareTo(o2.getValue());
    }

}
