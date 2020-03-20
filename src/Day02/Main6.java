package Day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/20 21:33
 **/
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.close();
        int [][]arr=new int [x][y];
        int [] result=new int[x*y];
        int index=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j]=index++;
            }
        }
        index=0;
        int i=0;
        int j=0;
        char tag='A';
        do {
            switch (tag) {
                case 'A':
                    while (i < x && arr[i][j] != 0) {
                        result[index++] = arr[i][j];
                        arr[i][j] = 0;
                        i++;
                    }
                    if (j + 1 < y && arr[--i][j + 1] != 0) {
                        tag = 'B';
                    }
                    break;
                case 'B':
                    while (j < y && arr[i][j] != 0) {
                        result[index++] = arr[i][j];
                        arr[i][j] = 0;
                        j++;
                    }
                    if (i - 1 > 0 && arr[i - 1][j] != 0) {
                        tag = 'C';
                    }
                    break;
                case 'C':
                    while (i > 0 && arr[i][j] != 0) {
                        result[index++] = arr[i][j];
                        arr[i][j] = 0;
                        i--;
                    }
                    if (j - 1 > 0 && arr[++i][j - 1] != 0) {
                        tag = 'D';
                    }
                    break;
                case 'D':
                    while (j > 0 && arr[i][j] != 0) {
                        result[index++] = arr[i][j];
                        arr[i][j] = 0;
                        j--;
                    }
                    if (i + 1 < x && arr[i + 1][++j] != 0) {
                        tag = 'A';
                    }
                    break;
            }
        } while (index != (x * y));
        System.out.println(Arrays.toString(result));
    }

}
