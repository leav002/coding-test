class Solution {
    public int solution(int n, int t) {
        
        int a = n;
        
        for(int i =0; i < t; i++){
            a = a+a;
        }
        
        return a;
    }
}