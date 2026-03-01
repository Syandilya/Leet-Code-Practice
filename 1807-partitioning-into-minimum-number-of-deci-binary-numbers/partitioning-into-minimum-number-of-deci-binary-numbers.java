class Solution {
    public int minPartitions(String n) {
        int l = n.length();
        int max = n.charAt(0) - '0';
        for(int i=1; i<l; i++){
            if(n.charAt(i) - '0'>max){
                max = n.charAt(i) - '0';
            }
        }
        return max;
    }
}