package Day02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 高精度加法
 * @author DELL
 * @Date 2020/3/19 14:04
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x=scan.next();
        String y=scan.next();
        int flag=0;
        int indexA=0;
        int indexB=0;
        int indexS=0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = null;
        ArrayList<Integer> result = null;
        for (int i = x.length()-1; i >=0 ; i--) {
            a.add(indexA++,x.charAt(i)-48);
        }
        for (int i = y.length()-1; i >=0 ; i--) {
            b.add(indexB++,y.charAt(i)-48);
        }
        int min=0;
        if(indexB<=indexA){
            result=a;
            c=b;
            indexS=indexA;
            min=indexB;
        }
        if(indexB>indexA){
            result=b;
            c=a;
            indexS=indexB;
            min=indexA;
        }
        for (int i = 0; i <min; i++) {
            int r=c.get(i)+result.get(i)+flag;
            flag=0;
            if(r>=10){
                result.set(i,r%10);
                flag=r/10;
            }else{
                result.set(i,r);
            }
        }
        for (int i = min; i <indexS; i++) {
            int r=result.get(i)+flag;
            flag=0;
            if(r>=10){
                result.set(i,r%10);
                flag=r/10;
            }else{
                result.set(i,r);
            }
        }
        if(flag!=0){
            result.add(flag);
        }
        for (int j = result.size()-1; j>=0; j--) {
            System.out.print(result.get(j));
        }
    }
}
