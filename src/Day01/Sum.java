package Day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/2 21:48
 **/
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n=input.nextInt();
        System.out.print(n*(n+1)/2);
    }
}
