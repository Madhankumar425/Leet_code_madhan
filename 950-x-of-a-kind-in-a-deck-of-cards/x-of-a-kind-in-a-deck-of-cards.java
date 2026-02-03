class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        if (deck.length < 2) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcdValue = 0;

        for (int count : map.values()) {
            gcdValue = gcd(gcdValue, count);
            if (gcdValue == 1) return false; // early exit
        }

        return gcdValue >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
