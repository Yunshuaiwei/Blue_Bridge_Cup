package Day03;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/23 18:21
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v1 = input.nextInt();//兔子的速度
        int v2 = input.nextInt();//乌龟的速度
        int t = input.nextInt();//兔子领先的距离
        int s = input.nextInt();//兔子休息的时间
        int l = input.nextInt();//赛道的长度
        int time = 0;
        int j = 0;
        for (int i = 0; i < l; ) {
            j += v1;//兔子一次前进的距离
            i += v2;//乌龟一次前进的距离
            if (j < l && j - i >= t) {
                if (i + s * v2 >= l) {
                    System.out.println("T");
                    System.out.println(l / v2);
                    return;
                } else {
                    time += s;
                    i = i + s * v2;
                    if (i >= l) {
                        System.out.println("T");
                        System.out.println(l / v2);
                        return;
                    }
                }
            }
            if (j >= l && i < l) {
                System.out.println("R");
                System.out.println(l / v1 + time);
                return;
            }
        }
        if (l == j) {
            System.out.println("D");
            System.out.println(l / v2);
        }
    }
}
