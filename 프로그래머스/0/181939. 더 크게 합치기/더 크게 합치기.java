class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String value1 = "";
        String value2 = "";
        value1 += Integer.toString(a) + b;
        value2 += Integer.toString(b) + a;
        if (Integer.parseInt(value1) > Integer.parseInt(value2) ||
           Integer.parseInt(value1) == Integer.parseInt(value2)) {
            answer = Integer.parseInt(value1);
        } else {
            answer = Integer.parseInt(value2);
        }
        return answer;
    }
}