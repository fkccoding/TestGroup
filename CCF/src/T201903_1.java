import java.util.Scanner;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2019/12/14 22:27
 */
public class T201903_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max, min;
        double mid;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }


        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[num - 1];
        } else {
            min = arr[0];
            max = arr[num - 1];
        }

        if (num%2 == 1) {
            mid = arr[num / 2];
            System.out.printf("%d %d %d",max, (int)mid, min);
        } else {
            int midsum = arr[num / 2 - 1] + arr[num / 2];
            if ((midsum) % 2 == 0) {
                mid = (midsum) / 2;
                System.out.printf("%d %d %d",max, (int)mid, min);

            } else {
                mid = (midsum) / 2.0;
                System.out.printf("%d %.1f %d",max, mid, min);
            }
        }


    }
}
