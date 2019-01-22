package InsertionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] shuffledArray = {2,1,3};
        int[] insertionArray = InsertionSort.InsertionSort(shuffledArray);
        int[] actualArray = {1,2,3};
        assertArrayEquals(insertionArray, actualArray);
    }

    @Test
    public void testInsertionSort2() {
        int[] shuffledArray = {2,1,3,5,2,4,5};
        int[] insertionArray = InsertionSort.InsertionSort(shuffledArray);
        int[] actualArray = {1,2,2,3,4,5,5};
        assertArrayEquals(insertionArray, actualArray);
    }

    @Test
    public void testInsertionSort3() {
        int[] shuffledArray = {3,3,3,3,3,3,3,3,3,3,3,3,3,2,1};
        int[] insertionArray = InsertionSort.InsertionSort(shuffledArray);
        int[] actualArray = {1,2,3,3,3,3,3,3,3,3,3,3,3,3,3};
        assertArrayEquals(insertionArray, actualArray);
    }

    @Test
    public void testInsertionSort4() {
        int[] shuffledArray = {1};
        int[] insertionArray = InsertionSort.InsertionSort(shuffledArray);
        int[] actualArray = {1};
        assertArrayEquals(insertionArray, actualArray);
    }

}