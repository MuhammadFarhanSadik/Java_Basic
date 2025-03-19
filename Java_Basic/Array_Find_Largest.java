
package java_basic_programming_by_farhan_sadik;


public class Array_Find_Largest {
   
 static int largest(int[] arr) {
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 77, 3264, 5, 33333, 67 };
        System.out.println(largest(arr));
    }
}

    

