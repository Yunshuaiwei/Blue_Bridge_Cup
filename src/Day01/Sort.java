package Day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/2 22:34
 **/
public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        quickSort(0, arr.length - 1, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int left, int right, int[] arr) {
        int l = left;
        int r = right;
        int pivot = arr[(l + r) / 2];
        while (l < r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            arr[l] ^= arr[r];
            arr[r] ^= arr[l];
            arr[l] ^= arr[r];
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }
        if (l == r) {
            l++;
            r--;
        }
        if (l < right) {
            quickSort(l, right, arr);
        }
        if (r > left) {
            quickSort(left, r, arr);
        }
    }
}
