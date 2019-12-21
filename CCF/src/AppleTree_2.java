import java.util.Scanner;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2019/12/14 16:08
 */
public class AppleTree_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeNum = scanner.nextInt();

        int sum = 0;
        boolean[] flag = new boolean[treeNum];
        for (int i = 0; i < treeNum; i++) {
            int num = scanner.nextInt();
            int apple = scanner.nextInt();
            for (int j = 0; j < num - 1; j++) {
                int drop = scanner.nextInt();
                if (drop > 0) {
                    if (apple != drop) {
                        apple = drop;
                        flag[i] = true;
                    }
                } else {
                    apple += drop;
                }
            }
            sum += apple;
        }

        int one = 0;
        int three = 0;
        int length = flag.length;
        for (int i = 0; i < length; i++) {
            int pred = (i + length - 1) % length;
            int succ = (i + length + 1) % length;
            if (flag[pred] && flag[i] && flag[succ]) {
                three++;
            }
            if (flag[i]) {
                one++;
            }
        }

        System.out.printf("%d %d %d", sum, one, three);
    }
}
