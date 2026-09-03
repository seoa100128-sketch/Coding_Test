import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int start = 0;
        int end = 0;
        int step = 1;
        
        if (n == 1) {
            start = 0;
            end = b;
        } else if (n == 2) {
            start = a;
            end = num_list.length - 1;
        } else if (n == 3) {
            start = a;
            end = b;
        } else if (n == 4) {
            start = a;
            end = b;
            step = c;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            result.add(num_list[i]);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}