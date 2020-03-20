package Day02;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 构造赫夫曼树
 * @author DELL
 * @Date 2020/3/20 11:45
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int [n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        scan.close();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(arr[i]);
        }
        while(queue.size()>1){
            Integer a = queue.peek();
            queue.poll();
            Integer b = queue.peek();
            queue.poll();
            queue.offer((a+b));
            num+=(a+b);
        }
        System.out.println(num);
    }
}
