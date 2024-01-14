class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if(str1.length()<str2.length()){
           String temp = str1;
           str1 = str2;
           str2=temp;
       } 
       
        while(str1.contains(str2)){
             int index = str1.indexOf(str2);
             if(index!=0) return "";
              str1 = str1.substring(index+str2.length());
              if(!str1.isEmpty()&&str1.length()<str2.length()){
                    String temp = str1;
                    str1 = str2;
                    str2=temp;
              }
        } 
        if(str1.isEmpty()) return str2;
        return "";
    }
}

=============
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdval=gcd(str1.length(),str2.length());
        return str2.substring(0,gcdval);
    }

    int gcd(int x,int y){
      if(y==0) return x;
      else return gcd(y,x%y);
    }
}

===========
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if(n1<n2)
        return gcdOfStrings(str2,str1);
        if(str1.equals(str2))
        return str1;
        if(str1.startsWith(str2))
        return gcdOfStrings(str1.substring(n2),str2);
        return "";
        }
    }
