/* Реализовать алгоритм сортировки слиянием*/

package Task6;

import java.util.Arrays;

public class Program6 {

    public static int[] mergeSort(int[] sortArr) {
        int[] buf1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buf2 = new int[sortArr.length];
        int[] result = mergeSortIn(buf1, buf2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortIn(int[] buf1, int[] buf2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buf1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortIn(buf1, buf2, startIndex, middle);
        int[] sorted2 = mergeSortIn(buf1, buf2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] sortArr = { 5, 45, 2, 12, 3, 1 };
        System.out.println(Arrays.toString(sortArr));
        int[] resultArr = mergeSort(sortArr);
        System.out.println(Arrays.toString(resultArr));
    }
}
