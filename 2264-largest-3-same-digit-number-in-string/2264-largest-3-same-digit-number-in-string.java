class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        int len=num.length();
        for(int i=0;i<len-2;i++){
            char a=num.charAt(i);
            char b=num.charAt(i+1);
            char c=num.charAt(i+2);
            if(a==b && b==c && c==a){
                if( res.length()==0 || a>res.charAt(0)){
                    res=num.substring(i,i+3);
                }
            }
        }
        return res;
    }
}