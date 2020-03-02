package Day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/2 21:37
 **/
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r=input.nextInt();
        double area=0;
        area=Math.PI*r*r;
        System.out.printf("%.7f",area);
    }
}
