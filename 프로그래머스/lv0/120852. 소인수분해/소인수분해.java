import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                n /= i;
                set.add(i);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}