package Day02;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/20 12:08
 **/
public class Main3 {
    static int count=0;
    static int [] array=null;
    static int queens=0;
    static int [][] arr=null;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        queens=scan.nextInt();
        array=new int[queens];
        arr=new int [queens][queens];
        for (int i = 0; i < queens; i++) {
            for (int j = 0; j < queens; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        scan.close();
        check(0);
        System.out.println(count);
    }

    private static void check(int n){
        if(n==queens){
            count++;
            return;
        }
        for (int i = 0; i < queens; i++) {
            if(arr[n][i]==1){
                array[n]=i;
            }else{
                continue;
            }
            if(judge(n)){//不冲突
                check(n+1);
            }
        }

    }

    /**
     * 判断是否冲突
     * @param n 第n个皇后
     * @return
     */
    private static boolean judge(int n){
        for (int i = 0; i < n; i++) {//i表示第i列上是否已经摆放了皇后
            if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }
}
