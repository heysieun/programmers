class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[end_num-start_num+1];
        
        for (int i = 0; i < result.length; i++){
            result[i] = start_num;
            start_num++;
        }
        
        return result;
    }
}