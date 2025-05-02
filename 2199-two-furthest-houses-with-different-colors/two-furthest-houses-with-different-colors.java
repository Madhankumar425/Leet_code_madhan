class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int st = 0;
        int end = n - 1;

        // Move 'end' left until colors[st] != colors[end]
        while (colors[st] == colors[end]) {
            end--;
        }
        int dist1 = end - st;

        st = 0;
        end = n - 1;

        // Move 'st' right until colors[st] != colors[end]
        while (colors[st] == colors[end]) {
            st++;
        }
        int dist2 = end - st;

        return Math.max(dist1, dist2);
    }
}
