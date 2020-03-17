package Day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 查找目标值
 * @author DELL
 * @Date 2020/3/17 16:02
 **/
public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int [] arr=new int [num];
        for (int i = 0; i < num; i++) {
            arr[i]=scan.nextInt();
        }
        int a=scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
