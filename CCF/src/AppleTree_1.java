import java.util.Scanner;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2019/12/14 16:07
 */
public class AppleTree_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeNum = scanner.nextInt();
        int time = scanner.nextInt();
        int sum = 0;
        int flag = 0;
        int max = 0;
        for (int i = 0; i < treeNum; i++) {
            sum += scanner.nextInt();
            int min = 0;
            for (int j = 0; j < time; j++) {
                min += scanner.nextInt();
            }
            if (min < max) {
                max = min;
                flag = i + 1;
            }
            sum += min;
        }


        System.out.printf("%d %d %d", sum, flag, -max);
    }

   /* int sum = 0;
    int flag = 0;
    int max = 0;
        for (int i = 0; i < treeNum; i++) {
        System.out.println("外层循环");
        sum += scanner.nextInt();
        int min = 0;
        for (int j = 0; j < time; j++) {
            System.out.println("内层循环");
            min += scanner.nextInt();
        }
        if (min < max) {
            max = min;
            flag = i + 1;
        }
        sum += min;
    }*/


    /*int[][] map = new int[treeNum][time + 1];
        for (int i = 0; i < treeNum; i++) {
        for (int j = 0; j < time + 1; j++) {
            map[i][j] = scanner.nextInt();
        }
    }
    int sum = 0;
        for (int i = 0; i < treeNum; i++) {
        for (int j = 0; j < time + 1; j++) {
            sum += map[i][j];
        }
    }
    int max = 0;
    int flag = 0;
        for (int i = 0; i < treeNum; i++) {
        int min = 0;
        for (int j = 1; j < time + 1; j++) {
            min += map[i][j];
        }
        if (min < max) {
            max = min;
            flag = i + 1;
        }
    }*/
}
