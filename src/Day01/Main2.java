package Day01;

import java.util.Scanner;

/**
 * 回文数，输入数字n，查找回文数，并且每一位数加起来之和等于等于数字n
 * @author DELL
 * @Date 2020/3/17 14:22
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = "";

        //求5位数
        for (int i = 10000; i <=99999; i++) {
            s="";
            s += i;
            if(n>45){
                break;
            }
            if (s.charAt(0) != s.charAt(4) || s.charAt(1) != s.charAt(3)) {
            } else {
                int a = s.charAt(0) - 48;
                int b = s.charAt(1) - 48;
                int c = s.charAt(2) - 48;
                if (((a + b) * 2 + c) == n) {
                    System.out.println(s);
                }
            }
        }
        //求6位数
        for (int i = 100000; i <=999999; i++) {
            s="";
            s += i;
            if (s.charAt(0) != s.charAt(5) || s.charAt(1) != s.charAt(4) ||
                    s.charAt(2) != s.charAt(3)) {
            } else {
                int a = s.charAt(0) - 48;
                int b = s.charAt(1) - 48;
                int c = s.charAt(2) - 48;
                if ((a + b + c) * 2 == n) {
                    System.out.println(s);
                }
            }
        }


    }
}
