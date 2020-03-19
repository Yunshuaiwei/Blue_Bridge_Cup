package Day01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 阶乘计算
 * @author DELL
 * @Date 2020/3/18 22:00
 **/
public class Main11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        //标记进位
        int flag=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int index=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=index; j++) {
                int a= list.get(j);
                a=(a*i+flag);
                flag=0;
                if(a>=10){
                    flag=a/10;
                    list.set(j,a%10);

                }else{
                    list.set(j,a);
                }
            }
            if(flag!=0){
                String s="";
                s+=flag;
                for (int j = s.length()-1; j >=0 ; j--) {
                    list.add((s.charAt(j)-48));
                    index++;
                }
                flag=0;
            }
        }
        for (int i = index; i >=0; i--) {
            System.out.print(list.get(i));
        }
    }
}
