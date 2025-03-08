class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        int a = 1;
        int b = 0;
        
        for(int i = 0; i < num_list.length; i++){
            a = a*num_list[i];
            b = b+num_list[i];
        }
        int c = b*b;
        if(a>c){
            answer = 0;
        }
        else{
            answer = 1;
        }

        return answer;
    }
}