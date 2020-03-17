package Day01;

import java.util.Scanner;

/**
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
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
        String s1 ="";
        StringBuffer b =null;
        for (int i = 0; i < col; i++) {
            s += (char) (c + i);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0){
                    System.out.println(s);
                    s="";
                    break;
                }else if(i==1){
                    b = new StringBuffer();
                    StringBuffer insert = b.insert(0, (char) (c + j));
                    s+=insert;
                }else{
                    b = new StringBuffer();
                    StringBuffer insert =b.insert(0,(char)(s1.charAt(s1.length()-2)+j));
                    s+=insert;
                }
            }
            if(i!=0){
                s1=s;
                System.out.println(s);
                s="";
            }
        }


//        for (int i = 1; i < row; i++) {
//            StringBuffer b = new StringBuffer(s1);
//            b.insert(0, (char) ('B' + i));
//            s1 = b.toString();
//        }





//        System.out.println(s1);
//        System.out.println(s);
//        for (int i = 1; i < row; i++) {
//            System.out.println(s1.substring(s1.length() - i) + s.substring(0, s.length() - i));
//        }
    }
}
