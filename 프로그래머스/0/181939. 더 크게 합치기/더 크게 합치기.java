class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int d = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        return Math.max(c, d);
    }
}
