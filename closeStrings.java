import java.util.SortedMap; 
import java.util.TreeMap; 
import java.util.Collection;
class Solution {
    public boolean closeStrings(String word1, String word2) {
         if(word1.length()!=word2.length()) return false;

         Map<Character,Integer>  map1 = new HashMap<>();
         Map<Character,Integer>  map2 = new HashMap<>();

         for(int i =0;i<word1.length();i++){
             int num = map1.getOrDefault(word1.charAt(i),0);
             map1.put(word1.charAt(i),num+1);

             num = map2.getOrDefault(word2.charAt(i),0);
             map2.put(word2.charAt(i),num+1);
         }
         if(map1.size()!=map2.size()) return false;
         if(!(map1.keySet().containsAll( map2.keySet()))) return false;
         
         //Collection<Integer> list4 = ;

          for(int l : map1.values()){
              if(map2.values().contains(l)) map2.values().remove(l);
          } 
          if(!(map2.values().isEmpty()))return false;
          return true;
    }
}


=====================

