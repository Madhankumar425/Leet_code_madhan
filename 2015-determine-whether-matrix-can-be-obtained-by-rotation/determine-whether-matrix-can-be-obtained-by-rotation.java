import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        for (int r = 0; r < 4; r++) {
            if (Arrays.deepEquals(matrix, target)) {
                return true;
            }
            matrix = rotateOnce(matrix); // rotate by 90° clockwise
        }
        return false;
    }

    // Rotate 90 degrees clockwise using extra space
    private int[][] rotateOnce(int[][] matrix) {
        int len = matrix.length;
        int[][] rotated = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                rotated[j][len - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }
}
