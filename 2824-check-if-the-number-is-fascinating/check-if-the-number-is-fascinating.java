class Solution {
    public boolean isFascinating(int n) {
        String str = String.valueOf(n) + String.valueOf(2 * n) + String.valueOf(3 * n);
        int[] freq = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            if (digit == 0) return false; // 0 should not appear
            freq[digit]++;
            if (freq[digit] > 1) return false; // no duplicates
        }

        // Check if digits 1 to 9 appeared exactly once
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) return false;
        }

        return true;
    }
}
