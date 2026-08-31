class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        
        for (int idx : indices) {
            arr[idx] = ' ';
        }
        StringBuilder answer = new StringBuilder();
        for (char c : arr) {
            if (c != ' ') {
                answer.append(c);
            }        
        }
        return answer.toString();
    }
}