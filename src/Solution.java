import java.util.*;

public class Solution {

    // Generic method to find maximum element
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array
        int N = sc.nextInt();
        Integer[] intArr = new Integer[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }

        // String array
        int M = sc.nextInt();
        String[] strArr = new String[M];
        for (int i = 0; i < M; i++) {
            strArr[i] = sc.next();
        }

        System.out.println("Max Integer: " + findMax(intArr));
        System.out.println("Max String: " + findMax(strArr));

        sc.close();
    }
}