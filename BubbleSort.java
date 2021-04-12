import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){

        int unsorted_list[] = {123, 232, 111, 222,999, 333, 321, 456, 765, 234, 1, 23, 33, 43, 56, 78,};
        //int sorted_list[] = new int[unsorted_list.length];
        int temp = 0;
        for (int i = 0; i < unsorted_list.length; i++) {
            for (int j = 0; j < unsorted_list.length -i-1; j++) {
                
                    if (unsorted_list[j] > unsorted_list[j+1]) {
                        temp = unsorted_list[j];
                        unsorted_list[j] = unsorted_list[j+1];
                        unsorted_list[j+1] = temp;
                    }
            } 
        }

        System.out.println("The sorted list is: " + Arrays.toString(unsorted_list));

    }
}