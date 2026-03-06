class Solution {
    public int minOperations(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int zero=solve(s,sb1,'0');
        int one=solve(s,sb2,'1');
        return Math.min(zero,one);
    }
    public static int solve(String s,StringBuilder sb,char ch){
        sb.append(ch);
        for(int i=1;i<s.length();i++){
            if(sb.charAt(sb.length()-1)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=sb.charAt(i)){
                c++;
            }
        }
        return c;
    }
}