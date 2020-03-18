package Day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/18 14:57
 **/
public class Main9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
