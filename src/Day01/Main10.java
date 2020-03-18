package Day01;

/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是:
 * 00000
 * 00001
 * 00010
 * 00011
 * 00100
 * 请按从小到大的顺序输出这32种01串。
 * @author DELL
 * @Date 2020/3/18 21:42
 **/
public class Main10 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            String s = Integer.toBinaryString(num);
            while (s.length() < 5) {
                StringBuffer b = new StringBuffer(s);
                b.insert(0, "0");
                s = b.toString();
            }
            System.out.println(s);
            num++;
        }
    }
}
