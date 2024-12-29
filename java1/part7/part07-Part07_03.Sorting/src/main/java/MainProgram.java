import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array){
    // write your code here
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++){
            if (smallestNumber > array[i]){
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }
    
    public static int indexOfSmallest(int[] array){
    // write your code here
        int smallestNumber = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (smallestNumber > array[i]){
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        int smallestNumber = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if (smallestNumber > table[i]){
                smallestNumber = table[i];
                index = i;
            }
        }
        return index;   
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++){
            int currentIndexofSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, currentIndexofSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
