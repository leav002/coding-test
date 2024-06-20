class Solution {
    public int[] solution(int[] arr, int n) {
        // 배열의 길이 구하기
        int length = arr.length;
        
        // 배열의 길이가 홀수인지 짝수인지에 따라 다른 인덱스에 n을 더함
        if (length % 2 == 1) { // 길이가 홀수인 경우
            for (int i = 0; i < length; i += 2) {
                arr[i] += n;
            }
        } else { // 길이가 짝수인 경우
            for (int i = 1; i < length; i += 2) {
                arr[i] += n;
            }
        }
        
        return arr;
    }
}
