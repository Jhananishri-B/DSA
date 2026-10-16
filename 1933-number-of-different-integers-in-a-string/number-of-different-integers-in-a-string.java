import java.util.*;
import java.math.BigInteger;
class Solution {
    public int numDifferentIntegers(String word) {
        String[] a=word.split("[a-zA-Z]+");
        Set<String> s=new HashSet<>();
        for(String x:a){
            if(!x.isEmpty()){
                s.add(new BigInteger(x).toString()); 
// using big int bcoz to not loss value  that are too large,(str to int conversion)
            }
        }
        return s.size();
    }
}