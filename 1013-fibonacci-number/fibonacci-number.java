class Solution {
    public int fib(int n) {
        int arr[] = new int[31];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        int a = arr[1];
        int b = arr[2];
        for(int i=3;i<=n;i++){
             int fib = a + b;
            arr[i] = fib;
            a = b;
            b = fib;
        }
        return arr[n];
    }
}