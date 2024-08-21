class Solution {
    public int solution(int[] num_list) {
        int hol = 0;
        int zak = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                zak += num_list[i];
            } else {
                hol += num_list[i];
            }
        }
return Math.max(zak, hol);
    }
}