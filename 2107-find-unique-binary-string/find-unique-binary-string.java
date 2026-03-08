
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> sets = new HashSet<>(Arrays.asList(nums));
        String[] dp = new String[nums.length + 1];
        Arrays.fill(dp, "");
        return help(nums, dp, nums.length, "", sets);
    }

    private String help(String[] nums, String[] dp, int i, String s, Set<String> sets) {
        if (i < 0) {
            return s;
        }
        if (i == 0) {
            return sets.contains(s) ? "" : s;
        }
        if (!dp[i].isEmpty()) {
            return dp[i];
        }
        
        String op1 = s + "0";
        dp[i] = help(nums, dp, i - 1, op1, sets);
        if (!dp[i].isEmpty()) {
            return dp[i];
        }

        String op2 = s + "1";
        dp[i] = help(nums, dp, i - 1, op2, sets);
        return dp[i];
    }
}