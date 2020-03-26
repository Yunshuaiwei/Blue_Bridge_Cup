package Day03;

import java.util.*;

/**
 * @author DELL
 * @Date 2020/3/25 16:18
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//芯片个数
        int[][] map = new int[n][n];//表
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = input.nextInt();
            }
        }
        input.close();
        HashSet<Integer> result = new HashSet<>();//用于保存结果
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {//排除芯片对本身进行测试的情况
                    continue;
                }
                if (map[i][j] == 1) {
                    if (map[j][i] == 1) {
                        result.add(i + 1);
                        result.add(j + 1);
                    }
                }
            }
        }
        //第一次遍历之后，将行和列相交处为1的情况保存在result中
        //但是其中有错误结果，例如两个芯片都是坏的，但是他们互相检测的结果都为1
        //此种情况需要排除
        Object[] arr = result.toArray();
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //因为给check传递的数组是int型，所以此处将Object类型的数组转换成int保存在tmp中
            //将Object转int不能直接转换，此处先将Object转为String，再转为int
            tmp[i] = Integer.parseInt(String.valueOf(arr[i]));
        }
        result.clear();
        //调用此方法后保证返回的是好芯片
        int check = check(tmp, map);
        //通过好的芯片再去检测其他芯片，则结果一定正确，
        //因为题中说明用好芯片测试其他芯片时，能正确给出被测试芯片是好还是坏
        for (int i = 0; i < n; i++) {
            if (map[check][i] == 1) {
                result.add(i + 1);
            }
        }
        Object[] objects = result.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
        }
    }

    /**
     * 排除两个都是坏芯片但是检测结果都为1的情况
     *
     * @param arr 第一次遍历后的中间结果
     * @param map 检测表
     * @return 返回的芯片一定是好的
     */
    public static int check(int[] arr, int[][] map) {
        int check = 0;
        int j;
        for (int value : arr) {
            check = value - 1;
            for (j = 0; j < arr.length; j++) {
                if (map[check][arr[j] - 1] != 1) {
                    break;
                }
            }
            if (j == arr.length) {
                break;
            }
        }
        return check;
    }
}
