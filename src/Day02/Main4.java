package Day02;

import java.util.Scanner;

/**
 * 报时助手
 * @author DELL
 * @Date 2020/3/20 17:01
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        String b = "";
        String[] singles = new String[]{"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] s = new String[]{"twenty", "thirty", "forty", "fifty"};
        if (m == 0) {
            if (h <= 19) {
                System.out.println(singles[h] + " o'clock");
            } else if (h == 20) {
                System.out.println(s[0] + " o'clock");
            } else {
                b += h;
                System.out.println(s[0] + " " + singles[b.charAt(1) - 48] + " o'clock");
            }
        } else {
            String a = "";
            b += m;
            if (m <= 19) {
                a += singles[m];
            } else {
                a += ((b.charAt(1) - 48 == 0) ? (s[b.charAt(0) - 50]) : (s[b.charAt(0) - 50] + " " + singles[b.charAt(1) - 48]));
            }
            b = "";
            if (h <= 19) {
                System.out.println(singles[h] + " " + a);
            } else if (h == 20) {
                System.out.println(s[0] + " " + a);
            } else {
                b += h;
                System.out.println(s[0] + " " + singles[b.charAt(1) - 48] + " " + a);
            }
        }
    }
}
