package Day03;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/26 16:25
 **/
public class Main4 {
    static String str = null;
    static int i = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("A");
        }
        System.out.println(fj(num));
    }

    public static String fj(int num) {
        str = "ABA";
        char c = 'C';
        if (num == 2) {
            return str;
        }
        num--;
        str = fj(num);
        return str + (char) (c + i++) + str;
    }
}
