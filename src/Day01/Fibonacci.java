package Day01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/2 19:47
 **/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner integers=new Scanner(System.in);
        int n=integers.nextInt();
        ArrayList<Integer>arrayList=new ArrayList<>(n);
        arrayList.add(0,1);
        arrayList.add(1,1);
        for(int i=2;i<n;i++){
            int temp=arrayList.get(i-1)+arrayList.get(i-2);
            if(temp>=10){
                temp-=10;
            }
            arrayList.add(i,temp);
        }
        System.out.println(arrayList.get(n-1));
    }
}
