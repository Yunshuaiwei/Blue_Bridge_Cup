package Day01;

/**
 * 特殊数字，三位数n，每一位数的立方之和加起来等于n
 * @author DELL
 * @Date 2020/3/17 15:38
 **/
public class Main4 {
    public static void main(String[] args) {
        for (int i = 100; i <=999; i++) {
            String s="";
            s+=i;
            int a=s.charAt(0)-48;
            int b=s.charAt(1)-48;
            int c=s.charAt(2)-48;
            if(i==(a*a*a+b*b*b+c*c*c)){
                System.out.println(i);
            }
        }
    }
}
