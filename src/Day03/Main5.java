package Day03;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/26 17:50
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (n == 1) {
            System.out.println(getAn(1) + "+" + 1);
            return;
        }
        String str = "";
        StringBuilder result = null;
        int index = 0;
        int j = 1;
        for (int i = n; i >= 1; i--) {
            String An = getAn(j++);
            str += An + "+" + i;
            if (i == n) {
                result = new StringBuilder(str);
            } else {
                result.append(str);
            }
            if (i != 1) {
                result.insert(0, "(");
                result.append(")");
            }
            str = "";
        }
        System.out.println(result);
    }

    public static String getAn(int n) {
        StringBuilder s = new StringBuilder("sin(1)");
        StringBuilder result = new StringBuilder("sin(1)");
        if (n == 1) {
            return s.toString();
        }
        int index = 5;
        for (int i = 2; i <= n; i++) {
            s.setCharAt(4, (char) (i + 48));
            if (i % 2 == 0) {
                result.insert(index, "-" + s);
            } else {
                result.insert(index, "+" + s);
            }
            index += 6;
        }
        return result.toString();
    }
}
