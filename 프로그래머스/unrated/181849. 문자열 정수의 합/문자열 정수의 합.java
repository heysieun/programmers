class Solution {
    public int solution(String num_str) {
        int result = 0;
        String[] arr = num_str.split("");
        
        for (int i = 0; i < arr.length; i++){
            result += Integer.parseInt(arr[i]);
        }
        return result;
    }
}