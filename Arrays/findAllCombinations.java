import java.util.*;

public class findAllCombinations{
    public static void printCombinations(int[] arr, int r) {
    List<Integer> temp = new ArrayList<>();
    generate(arr, 0, r, temp);
}
private static void generate(int[] arr, int index, int r, List<Integer> temp) {

    //If we selected r elements -> print
    if (temp.size() == r) {
        System.out.println(temp);
        return;
    }

    //If we reached end -> stop
    if(index == arr.length) return;

    //Take the element
    temp.add(arr[index]);
    generate(arr, index+1, r, temp);

    //Remove it(backtrack)
    temp.remove(temp.size() - 1);

    //Dont take the element
    generate(arr,index+1,r,temp);
}
public static void main(String[] args) {
    int[] arr = {1,2,3};
    printCombinations(arr,2);
}
}
