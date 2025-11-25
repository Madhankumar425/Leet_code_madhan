class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // Array to store character frequencies (ASCII characters)
        
        // Count the frequency of each character in the string
        for (final char c : s.toCharArray()) {
            count[c]++;
        }
        
        int ans = 0;
        // Add all possible pairs (even counts) to the total length
        for (final int freq : count) {
            ans += freq / 2 * 2; // Add the largest even number less than or equal to freq
        }
        if (ans < s.length()) {
            ans++;
        }
        
        return ans;
    }
}
