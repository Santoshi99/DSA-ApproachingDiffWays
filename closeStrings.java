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
         
         Set<Character> list1 = map1.keySet();
         Set<Character> list2 = map2.keySet();
         
          if(!list1.containsAll(list2)) return false;
         
         
          Map<Integer,Integer> value1 = new HashMap<>();
          Map<Integer,Integer> value2 = new HashMap<>();
          for(Character key : list1){
              int c = value1.getOrDefault(map1.get(key),0);
              value1.put(map1.get(key),c+1);
          }
          for(Character key : list2){
              int c = value2.getOrDefault(map2.get(key),0);
              value2.put(map2.get(key),c+1);
            
          }
          Set<Integer> valset1 = value1.keySet();
          Set<Integer> valset2 = value2.keySet();
         
         if(!valset1.containsAll(valset2))
              return false;
         for(int i : valset1){
             //System.out.println( value1.get(valset1) + " "+value2.get(valset1))
            if(value1.get(i)!=value2.get(i))
            return  false;
         }
         
          
          return true;
    }
}


========================
