import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String subStr = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(subStr);
            if (num > k) {
                result.add(num);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}