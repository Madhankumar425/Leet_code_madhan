class Solution {
    public double minimumAverage(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = len-1;
        ArrayList<Double> list = new ArrayList<>();
        while(i<j){
            double avg = (nums[i]+nums[j])/2.0;
            list.add(avg);
            i++;
            j--;
        }
        Collections.sort(list);
        return list.get(0);
    }
}