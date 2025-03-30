class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean toDelete = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean toDelete = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}
