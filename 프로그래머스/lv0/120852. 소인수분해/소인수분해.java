import java.util.*;

class Solution {
    public int[] solution(int n) {
        int divisor = 2;
        int[] arr = new int[n+1];
        int idx = 0;
        while (n > 1){
            if (n % divisor == 0){
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
            set.add(arr[i]);
            }
        }
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
        int[] uniqueArr = new int[treeSet.size()];
        int idx2 = 0;
        for (Integer num : treeSet) {
            uniqueArr[idx2++] = num;
        }
        return uniqueArr;
    }
}