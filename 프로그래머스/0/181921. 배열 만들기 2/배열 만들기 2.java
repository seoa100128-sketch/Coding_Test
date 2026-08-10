import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num = l; num <= r; num++) {
            if (check(num)) {
                result.add(num);
            }
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
    private boolean check(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}