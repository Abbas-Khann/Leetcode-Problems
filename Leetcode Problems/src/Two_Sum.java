// Solution to the first leetcode problem Two Sum using HashMap Data Structure

import java.util.HashMap;
import java.util.Map;

class Two_Sum {
    public static void main(String[] args) {

        int[] numbers = new int[] {2,7,11,15};
        int target = 9;
        int[] result = getTwoSum(numbers , target);
        System.out.print(result[0]+","+ result[1]);
    }
    public static int [] getTwoSum (int[] numbers, int target){
        Map<Integer, Integer> VisitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (VisitedNumbers.containsKey(delta)) {
                return new int[] {i,VisitedNumbers.get(delta) };
            }
            VisitedNumbers.put(numbers[i], i);
        }
         return new int[] {-1 , -1};
    }
}