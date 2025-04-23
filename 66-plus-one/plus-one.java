class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Just increment and return
                return digits;
            }
            digits[i] = 0; // Set current digit to 0 and carry over to next
        }

        // If all digits were 9, e.g., [9,9,9], we need an extra digit at front
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
