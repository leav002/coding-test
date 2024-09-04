class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = (num_list.length + n - 1) / n; 
        int[] answer = new int[length];
        int c = 0;

        for (int i = 0; i < num_list.length; i += n) {
            answer[c] = num_list[i];
            c++;
        }
        
        return answer;
    }
}
