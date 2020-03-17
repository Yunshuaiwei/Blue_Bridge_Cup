package Day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/17 16:36
 **/
public class Main7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
                sum += arr[i];
                continue;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
