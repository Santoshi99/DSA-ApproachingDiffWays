import java.util.SortedMap; 
import java.util.TreeMap; 
import java.util.Collection;
class Solution {
    public boolean closeStrings(String word1, String word2) {
         if(word1.length()!=word2.length()) return false;

         Map<Character,Integer>  map1 = new HashMap<>();
         Map<Character,Integer>  map2 = new HashMap<>();

         for(int i =0;i<word1.length();i++){
             map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);

             map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
         }
         
         if(!(map1.keySet().equals( map2.keySet()))) return false;
         

          for(int l : map1.values()){
              if(map2.values().contains(l)) map2.values().remove(l);
          } 
          if(!(map2.values().isEmpty()))return false;
          return true;
    }
}
Time Complexity: O(n)
Space Complexity: O(1)

=====================

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); ++i) {
            freq1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); ++i) {
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
                return false; 
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; ++i) {
            if (freq1[i] != freq2[i]) {
                return false; 
            }
        }
        return true;
    }
}
