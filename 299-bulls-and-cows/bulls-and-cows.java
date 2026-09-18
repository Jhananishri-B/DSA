import java.util.*;
class Solution {
    public String getHint(String a, String b) {
        int n = a.length();       
        int first = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
            first++;
            }
        }
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                mapA.put(a.charAt(i),
                    mapA.getOrDefault(a.charAt(i), 0) + 1);
                mapB.put(b.charAt(i),
                    mapB.getOrDefault(b.charAt(i), 0) + 1);
            }
        }
        int third = 0;
        for (char ch : mapA.keySet()) {
            if (mapB.containsKey(ch)) {
                third += Math.min(mapA.get(ch),mapB.get(ch));
            }
        }
        return first + "A" + third + "B";
    }
}