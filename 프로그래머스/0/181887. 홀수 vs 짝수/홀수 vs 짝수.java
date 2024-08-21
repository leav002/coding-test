class Solution {
    public int solution(int[] num_list) {
        int two = 0;
        int three = 0;
        int answer = 0;
        for(int i = 0; i<num_list.length; i++){
            if(i%2==0){
                two +=num_list[i];
            }
            else{
                three +=num_list[i];
            }
        }
        if(two>=three){
            answer = two;
        }
        else{
            answer = three;
        }
        return answer;
    }
}