import java.util.HashMap;

class FruitsIntoBaskets {
    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {

            //Add current fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            //Shrink if more than 2 types
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {

        int[] fruits = {3, 2, 3, 2, 3, 4, 5};
        int result = totalFruit(fruits);
        System.out.println("Maximum fruits collected = " + result);
    }
}
