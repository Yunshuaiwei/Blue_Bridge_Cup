package Day01;

import java.util.Scanner;

/**
 * 杨辉三角
 * @author DELL
 * @Date 2020/3/17 15:44
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level=scan.nextInt();
        int [][] arr=new int[level][level];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                arr[i][j]=1;
                if(i>1&&j>0){
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
