class Solution {
    public String[] solution(String my_string) {
        String[] result = my_string.trim().split("\\s+");
        String[] answer = new String[result.length];
        
        for (int i = 0; i < result.length; i++){
            answer[i] = result[i];
        }
        return answer;
    }
}