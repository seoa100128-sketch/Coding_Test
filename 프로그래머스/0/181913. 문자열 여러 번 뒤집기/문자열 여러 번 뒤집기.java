class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1]; 
            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
        return new String(arr);
    }
}