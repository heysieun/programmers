class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        int result = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }
        result = Integer.parseInt(even) + Integer.parseInt(odd);
        return result;
    }
}