package Lesson8_0308.Easy;

import java.util.HashMap;
import java.util.List;

public class SearchDuplicate  {

    public static HashMap<String, Integer> duplicate (List<String> arr) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String x : arr) {
            if (hashMap.containsKey(x)) {
                hashMap.put(x, hashMap.get(x) + 1);
            } else {
                hashMap.put(x, 1);
            }

        }
        return hashMap;
    }
}
