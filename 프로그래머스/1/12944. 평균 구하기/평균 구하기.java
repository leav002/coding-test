class Solution {
    public double solution(int[] arr) {
        double sum = 0 ;
        int i;
        for(i = 0; i<arr.length; i ++){
            sum = sum + arr[i];
        }
        return sum/i;
    }
}