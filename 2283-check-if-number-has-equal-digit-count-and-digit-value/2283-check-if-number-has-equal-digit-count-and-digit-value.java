class Solution {
    public boolean digitCount(String num) {
         int arr[]=new int[10];
         for(int i=0;i<num.length();i++){
             arr[num.charAt(i)-'0']+=1;
         } 
         String temp="";
        for(int i=0;i<num.length();i++){
            temp+= arr[i];
         }
         if(num.equals(temp)){
            return true;
         }
         return false;
    }
}