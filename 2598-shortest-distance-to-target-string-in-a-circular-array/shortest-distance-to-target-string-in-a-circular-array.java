class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int val = Integer.MAX_VALUE;
        int n = words.length;

        for(int i = 0 ; i < n ; i++){
            if(words[i].equals(target)){
                int diff = Math.abs(i - startIndex);
                int circularDist = Math.min(diff, n - diff);
                val = Math.min(val, circularDist);
            }
        }

        return val == Integer.MAX_VALUE ? -1 : val;
    }
}