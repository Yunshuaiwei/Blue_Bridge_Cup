package Day01;

/**
 * 回文数
 * @author DELL
 * @Date 2020/3/17 15:34
 **/
public class Main3 {
    public static void main(String[] args) {
        String s="";
        for (int i = 1000; i <=9999; i++) {
            s="";
            s+=i;
            if(s.charAt(0)==s.charAt(3)&&s.charAt(1)==s.charAt(2)){
                System.out.println(s);
            }
        }
    }
}
