public class Solution {
    public int[] solution(int[] num_list) {
        int[] mun_list = new int[num_list.length];
        int j = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            mun_list[j] = num_list[i];
            j++;
        }
        return mun_list;
    }
}
