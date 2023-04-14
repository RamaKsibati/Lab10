import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
/** add tests to check for this unit test **/

      SelectionSort temp1 = new SelectionSort();
      int[] sorted = temp1.basicSelectionSort(arr);

      /** add tests to check for this unit test **/
      for (int i=0; i<Sortedarr.length; i++) {
      assertEquals(Sortedarr[i], sorted[i], "The values are not the same (Positives)");
      }
    }

    @Test
    public void testNegative()
    {
      /** Test data contains negative values only **/
     int[] arr = new int[5];
     arr[0] = -11;
     arr[1] = -8;
     arr[2] = -12;
     arr[3] = -15;
     arr[4] = -10;

     int[] Sortedarr = new int[5];
     Sortedarr[0] = -15;
     Sortedarr[1] = -12;
     Sortedarr[2] = -11;
     Sortedarr[3] = -10;
     Sortedarr[4] = -8;

     SelectionSort temp1 = new SelectionSort();
     int[] sorted = temp1.basicSelectionSort(arr);

     /** add tests to check for this unit test **/
     for (int i=0; i<Sortedarr.length; ++i) {
     assertEquals(Sortedarr[i], sorted[i], "The values are not the same (Negatives)");
    
    }
    }
public void testMixed(){
/** Test data contains with both positive, negative and zeros **/
}
public void testDuplicates(){
/** Test data contains duplicates **/
}
}
**