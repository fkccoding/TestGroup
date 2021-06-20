import java.util.ArrayList;
import java.util.List;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/4/9 20:53
 */
public class MyQuickSort {
    public static void main(String[] args) {
        int[] ary = {1,8,3,5,2,0,1,6};
        int[] bry = quickSort(ary);

        for (int i = 0; i < bry.length; i++) {
            System.out.println(bry[i]);
        }
    }

    static int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int pivot = arr[0];
            List<Integer> less = new ArrayList<>();
            List<Integer> more = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= pivot) {
                    less.add(arr[i]);
                } else {
                    more.add(arr[i]);
                }
            }
            int[] a = less.stream().mapToInt(Integer::intValue).toArray();
            int[] b = more.stream().mapToInt(Integer::intValue).toArray();

            int[] left = quickSort(a);

            int[] all = new int[arr.length];
            for (int i = 0; i < left.length; i++) {
                all[i] = left[i];
            }

            all[left.length] = pivot;

            int[] right = quickSort(b);

            for (int i = 0; i < right.length; i++) {
                all[left.length+i+1] = right[i];
            }
            return all;
        }
    }
}
