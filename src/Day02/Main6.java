package Day02;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/20 21:33
 **/
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int x=sc.nextInt();
        int y=sc.nextInt();
        int [][]arr=new int [x][y];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        char tag='A';
        do {
            switch (tag) {
                case 'A'://下
                    while (i < x && arr[i][j] != 0) {
                        if(i==0&&j==0){
                            System.out.print(arr[i][j]);
                        }else{
                            System.out.print(" "+arr[i][j]);
                        }
                        index++;
                        arr[i][j] = 0;
                        i++;
                    }
                    if (j + 1 < y && arr[--i][++j] != 0) {
                        tag = 'B';
                    }
                    break;
                case 'B'://右
                    while (j < y && arr[i][j] != 0) {
                        System.out.print(" "+arr[i][j]);
                        arr[i][j] = 0;
                        j++;
                        index++;
                    }
                    if (i - 1 > 0 && arr[--i][--j] != 0) {
                        tag = 'C';
                    }
                    break;
                case 'C'://上
                    while (i >=0 && arr[i][j] != 0) {
                        System.out.print(" "+arr[i][j]);
                        arr[i][j] = 0;
                        index++;
                        i--;
                    }
                    if (j - 1 >=0 && arr[++i][--j] != 0) {
                        tag = 'D';
                    }
                    break;
                case 'D'://左
                    while (j >=0 && arr[i][j] != 0) {
                        System.out.print(" "+arr[i][j]);
                        arr[i][j] = 0;
                        index++;
                        j--;
                    }
                    if (i + 1 < x && arr[++i][++j] != 0) {
                        tag = 'A';
                    }
                    break;
            }
        } while (index != (x * y));

    }
}
