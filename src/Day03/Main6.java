package Day03;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/26 19:48
 **/
public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();
        String s = "";
        String[] tmp = {
                "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba",
                "jiu", "shi", "bai", "qian", "wan"
        };
        int l = str.length() - 1;
        int index = 0;
        StringBuilder result = new StringBuilder();
        while (true) {
            char key = 0;
            if (l == 1 || l == 5 || l == 9) {
                key = 'e';
            }
            if (l == 2 || l == 6) {
                key = 'a';
            }
            if (l == 3 || l == 7) {
                key = 'b';
            }
            if (l == 4) {
                key = 'c';
            }
            if (l == 8) {
                key = 'd';
            }
            switch (key) {
                case 'a':
                    s += tmp[11];//百
                    break;
                case 'b':
                    s += tmp[12];//千
                    break;
                case 'c':
                    s += tmp[13];//万
                    break;
                case 'd':
                    s += tmp[1];//亿
                    break;
                case 'e':
                    s += tmp[10];
                    break;
            }
            int n = str.charAt(index) - 48;
            if (index == 0) {
                result.insert(0, tmp[n] + " ");
            } else {
                result.append(tmp[n]).append(" ");
            }
            index++;
            result.append(s).append(" ");
            s = "";
            l--;
            if (l == -1) {
                break;
            }
        }
        System.out.println(result);
    }
}
