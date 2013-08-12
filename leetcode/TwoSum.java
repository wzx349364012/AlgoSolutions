public class TowSum {
    public int[] twoSum(int[] numbers, int target) {
        /*int[] result = new int[2];
        for(int i = 0; i < numbers.length - 1; i++) {//from 0 to length - 2;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i + 1; 
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;*/

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++) {//from 0 to length - 1;   
            if(map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                if(index < i) {
                    result[0] = index + 1;
                    result[1] = i + 1;
                    break;
                }
            }
            if(!map.containsKey(numbers[i]))
                map.put(target - numbers[i], i);
        }
        return result;
    }
}