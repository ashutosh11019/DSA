package Questions;

import java.util.*;

class Solutions {
    public List<List<String>> groupAnagram(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}

public class Group_Anagram {
    public static void main(String[] args) {
        String[] strs = {"home", "hi", "ashu", "hash", "eat", "tea", "ten", "net"};
        Solutions s = new Solutions();
        List<List<String>> ans = s.groupAnagram(strs);
        System.out.println(ans);
    }
}
