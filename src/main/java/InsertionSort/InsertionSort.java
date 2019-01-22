package InsertionSort;

public class InsertionSort {

//got inspiration for this code from (https://www.geeksforgeeks.org/insertion-sort/)
    public static int[] InsertionSort(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            int j = 0;
            int value = list[i + 1];
            while(list[j] < value) {j++;}
            for(int z = i; z >= j; z--) {
                list[z + 1] = list[z];
            }
            list[j] = value;
        }
        return list;
    }
}

