package Day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/16 21:23
 **/
class Main {

    public static void main(String[] args) {
        

	}
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n=s.nextInt();
//        int i=0;
//        int index=0;
//        Map<Character, String> m = new HashMap<>(5);
//        m.put('A',"1010");
//        m.put('B',"1011");
//        m.put('C',"1100");
//        m.put('D',"1101");
//        m.put('E',"1110");
//        m.put('F',"1111");
//        ArrayList<String> str = new ArrayList<>();
//        while(n>0){
//            String a=s.next();
//            str.add(i,a);
//            i++;
//            n--;
//        }
//        for (String s1 : str) {
//            String result = toOctal(s1, m);
//            System.out.println(result);
//        }
//    }
//    public static String toOctal(String num, Map<Character, String> m){
//        String s= "";
//        String s1;
//        String s2="";
//        for (int i = 0; i<num.length(); i++) {
//            int a=num.charAt(i)-48;
//            if(a<10){
//                s1 = toBinary(a);
//            }else{
//                s1=m.get(num.charAt(i));
//            }
//            s+=s1;
//
//
//        }
//        if(s.length()%3!=0){
//            StringBuffer sb = new StringBuffer(s);
//            sb.insert(0,"0");
//            s=sb.toString();
//        }
//
//        for (int i =0 ; i<s.length(); i+=3) {
//            int a=s.charAt(i)-48;;
//            int b=0;
//            int c=0;
//            if(i+1<s.length()){
//                b=s.charAt(i+1)-48;
//            }
//            if(i+2<s.length()){
//                c=s.charAt(i+2)-48;
//            }
//            if(a==1){
//                a=4;
//            }
//            if(b==1){
//                b=2;
//            }
//            int result=a+b+c;
//            s2+=result;
//        }
//        while(s2.charAt(0)=='0'){
//            s2=s2.substring(1);
//        }
//        return s2;
//    }
//    public static String toBinary(int a){
//        String s = Integer.toBinaryString(a);
//        while(s.length()!=4){
//            StringBuffer sb = new StringBuffer(s);
//            sb.insert(0,"0");
//            s=sb.toString();
//        }
//        return s;
//    }
}

