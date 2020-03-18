package Day01;

import java.util.Scanner;

/**
 * 字母图形
 * @author DELL
 * @Date 2020/3/17 16:48
 **/
public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        char c = 'A';
        String s = "";
        StringBuffer b ;
        if(col==1){
            for (int i = 0; i <row; i++) {
                System.out.println((char)(c+i));
            }
            return;
        }
        for (int i = 0; i < col; i++) {
            s += (char) (c + i);
        }
        System.out.println(s);
        for (int i = 1; i < row; i++) {
            s=s.substring(0,s.length()-1);
            c=(s.charAt(0));
            b = new StringBuffer(s);
            b.insert(0, (char)(c+1));
            s=b.toString();
            System.out.println(s);
        }
    }
}
