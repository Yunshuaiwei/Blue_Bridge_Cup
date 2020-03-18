package Day01;


import java.util.ArrayList;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/18 22:00
 **/
public class Main11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int flag=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int index=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=index; j++) {
                int a=list.get(j);
                a=(a*i)+flag;
                flag=0;
                if(a>=10){
                    if(i!=n){
                        flag=a/10;
                    }
                    list.set(j,a%10);
                    list.add(a/10);
                    index++;
                    break;
                }else{
                    list.set(j,a);
                }
            }
//            int a=list.get(index);
//            a=(a*i)+flag;
//            flag=0;
//            if(a>=10){
//                if(i!=n){
//                    flag=1;
//                }
//                list.set(index,a%10);
//                list.add(a/10);
//                index++;
//            }else{
//                list.set(index,a);
//            }
        }
        if(flag==1){
            list.add(1);
        }
        for (int i = index; i >=0; i--) {
            System.out.print(list.get(i));
        }

    }
}
