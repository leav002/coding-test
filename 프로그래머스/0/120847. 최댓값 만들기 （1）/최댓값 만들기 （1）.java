class Solution {
    public int solution(int[] numbers) {
        int maxnum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                int s = numbers[i] * numbers[j];
                if (s > maxnum) {
                    maxnum = s;
                }
            }
        }
        return maxnum;
    }
}
