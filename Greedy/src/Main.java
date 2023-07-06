import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
//        3-1
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int money = Integer.parseInt(br.readLine());
//        int moneyType[] = {500, 100, 50, 10};
//        int count = 0;
//        for (int mt: moneyType) {
//            if (money >= mt) {
//                count += money / mt;
//                money = money % mt;
//            }
//        }
//        System.out.println(count);

//        3-2
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str[] = br.readLine().split(" ");
//
//        int arrSize = Integer.parseInt(str[0]);
//        int numSize = Integer.parseInt(str[1]);
//        int restrict = Integer.parseInt(str[2]);
//        int count = 0;
//        int result = 0;
//
//        String strNums[] = br.readLine().split(" ");
//
//        int nums[] = new int[arrSize];
//        for (int i = 0; i < arrSize; i++) {
//            nums[i] = Integer.parseInt(strNums[i]);
//        }
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < numSize; i++) {
//            if(count == restrict){
//                count = 0;
//                result += nums[3];
//            }else{
//                result += nums[4];
//                count++;
//            }
//        }
//
//        System.out.println(result);
//        3-3
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String coordinate[] = br.readLine().split(" ");
//
//        int x = Integer.parseInt(coordinate[0]);
//        int y = Integer.parseInt(coordinate[1]);
//        int result[] = new int[x];
//
//        for (int i = 0; i < x; i++) {
//            String str[] = br.readLine().split(" ");
//            int nums[] = new int[y];
//            for (int j = 0; j < str.length; j++) {
//                nums[j] = Integer.parseInt(str[j]);
//            }
//            Arrays.sort(nums);
//            result[i] = nums[0];
//        }
//        Arrays.sort(result);
//        System.out.println(result[x-1]);
    }
}