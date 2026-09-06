import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        if (firstIndex == -1) {
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
    }
}