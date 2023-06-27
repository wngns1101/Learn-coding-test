import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        1001
        System.out.printf("Hello");

        1002
        System.out.printf("Hello World");

        1003
        System.out.println("Hello");
        System.out.printf("World");

        1004
        System.out.printf("'Hello'");

        1005
        System.out.printf("\"Hello World\"");

        1006
        System.out.println("!@#$%^&*()");

        1007
        System.out.println("C:\\Download\\hello.java");

        1008
        System.out.println("\u250C\u252C\u2510");
        System.out.println("\u251C\u253C\u2524");
        System.out.println("\u2514\u2534\u2518");

        1010
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(br.readLine());
        System.out.println(i);


        1011
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        System.out.println(c);

        1012
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float f = Float.parseFloat(br.readLine());
        System.out.println(f);

        1013
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        System.out.println(Integer.parseInt(str[0])+ " " + Integer.parseInt(str[1]));

        1014
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        System.out.println(str[1] + " " + str[0]);

        1015
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float num = Float.parseFloat(br.readLine());
        System.out.printf("%.3f", num);

        1017
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(num + " " + num + " " + num);

        1018
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time[] = br.readLine().split(":");
        System.out.println(time[0] + ":" + time[1]);

        1019
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("[.]");
        System.out.println(str[0] + ".0" + str[1] + ".0" + str[2]);

        1020
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("-");
        System.out.println(str[0] + str[1]);

        1021
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        1022
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        1023
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split("[.]");
        for (var i: num){
            System.out.println(i);
        }

        1024
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("");
        for (var i: str){
            System.out.println("'" + i + "'");
        }

        1025
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("");
        int count = str.length;
        for (var i: str){
            count = count - 1;
            double num = Integer.parseInt(i) * Math.pow(10, count);
            System.out.println("[" + (int) num + "]");
        }

        1026
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time[] = br.readLine().split(":");
        System.out.println(time[1]);

        1027
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String birth[] = br.readLine().split("[.]");
        System.out.printf(birth[2]);
        for(int i = 1; i>=0; i--){
            System.out.printf("-" + birth[i]);
        }

        1028
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.println(Long.parseLong(num));

        1029
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(br.readLine());
        System.out.printf("%.11f", num);

        1030
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.println(Long.parseLong(num));

        1031
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%o", Integer.parseInt(num));

        1032
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%x", Integer.parseInt(num));

        1033
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%X", Integer.parseInt(num));

        1034
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%d", Integer.parseInt(num, 8));

        1035
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%o", Integer.parseInt(num, 16));

        1036
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.printf("%d", num.codePointAt(0));

        1037
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println((char)num);

        1038
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));

        1039
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        System.out.println(Long.parseLong(num[0]) + Long.parseLong(num[1]));

        1040
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.println(-Integer.parseInt(num));

        1041
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char num = br.readLine().charAt(0);
        System.out.println((char)((int)num+1));

        1042
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        System.out.println(Integer.parseInt(str[0]) / Integer.parseInt(str[1]));

        1043
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        System.out.println(Integer.parseInt(str[0]) % Integer.parseInt(str[1]));

        1044
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(br.readLine());
        System.out.println(++num);

        1045
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);
        System.out.println(firstNum % secondNum);
        System.out.println(String.format("%.2f", (float)firstNum / (float)secondNum));

        1046
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        int thirdNum = Integer.parseInt(num[2]);
        int sum = firstNum + secondNum + thirdNum;
        System.out.println(sum);
        System.out.println((float)sum / 3);

        1047
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(num << 1);

        1048
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println((int)(firstNum * Math.pow(2, secondNum)));

        1049
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (firstNum > secondNum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1050
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (firstNum == secondNum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1051
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (secondNum >= firstNum) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1052
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (secondNum != firstNum) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1053
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1054
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (firstNum == 1 && secondNum == 1) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1055
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if (firstNum == 1 || secondNum == 1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1056
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if((firstNum==1 && secondNum==0) || (firstNum==0 && secondNum==1)) {
            System.out.print(1);
        }else {
            System.out.print(0);
        }

        1057
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if((firstNum == 1 && secondNum == 1) && (firstNum == 0 && secondNum == 0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1058
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        if(firstNum == 0 && secondNum == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        1059
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(~num);

        1060
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println(firstNum & secondNum);

        1061
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println(firstNum | secondNum);

        1062
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println(firstNum ^ secondNum);

        1063
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        System.out.println(firstNum > secondNum ? firstNum : secondNum );

        1064
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        int thirdNum = Integer.parseInt(num[2]);
        System.out.println((firstNum < secondNum && firstNum < thirdNum)? firstNum: (secondNum < thirdNum)? secondNum: thirdNum );

        1065
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        for (var i: num){
            if (Integer.parseInt(i) % 2 == 0){
                System.out.println(i);
            }
        }

        1066
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        for (var i : num){
            if (Integer.parseInt(i) % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }

        1067
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        if (num < 0){
            System.out.println("minus");
        }else{
            System.out.println("plus");
        }
        if (num % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        1068
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num >= 90){
            System.out.println("A");
        }else if(num >= 70 && num <= 90){
            System.out.println("B");
        }else if(num >= 40 && num <= 70){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

        1069
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char num = br.readLine().charAt(0);
        switch (num){
            case 'A':
                System.out.println("best!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            default:
                System.out.println("slowly~");
                break;
        }

        1070
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;

        }

        1071
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        for (var i: num) {
            if (i.equals("0")) {
                break;
            }else{
                System.out.println(i);
            }
        }

        1072
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String num[] = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            System.out.println(num[i]);
        }

        1073
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            } else {
                System.out.println(num);
            }

        }

        1074
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = count; i > 0; i--) {
            System.out.println(i);
        }

        1075
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = count-1; i >= 0; i--) {
            System.out.println(i);
        }

        1076
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpabet = br.readLine();
        int num = alpabet.codePointAt(0);
        int count = 97;
        while (true) {
            if (num == count){
                System.out.print((char)count);
                break;
            }
            System.out.print((char)count + " ");
            count++;
        }

        1077
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i=0; i<=count; i++){
            System.out.println(i);
        }

        1078
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        1079
        Scanner sc = new Scanner(System.in);
        while (true) {
            char a = sc.next().charAt(0);
            if (a == 'q') {
                System.out.println(a);
                break;
            }
            System.out.println(a);
        }

        1080
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
        int startNum = 1;
        while(true){
            if (sum >= num){
                System.out.println(count);
                break;
            }
            sum += startNum;
            count++;
            startNum++;
        }

        1081
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        for(int i=1; i<=firstNum; i++){
            for (int j=1; j<=secondNum; j++){
                System.out.println(i + " " + j);
            }
        }

        1082
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine(), 16);
        for(int i=1; i<=16; i++){
            System.out.println("B*"+Integer.toHexString(i)+"="+Integer.toHexString(num*i));
        }

        1083
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            if(i % 3 == 0) {
                System.out.print("X" + " ");
            }else{
                System.out.print(i + " ");
            }
        }

        1084
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        int thirdNum = Integer.parseInt(num[2]);
        for (int i=0; i<thirdNum; i++){
            for (int j=0; j<secondNum; j++){
                for (int k=0; k<firstNum; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        System.out.println(firstNum*secondNum*thirdNum);

        1085
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        double firstNum = Integer.parseInt(num[0]);
        double secondNum = Integer.parseInt(num[1]);
        double thirdNum = Integer.parseInt(num[2]);
        double fourthNum = Integer.parseInt(num[3]);
        double result = (((firstNum * secondNum * thirdNum * fourthNum) / 8) / 1024)/1024;
        System.out.printf("%.1fMB", result);

        1086
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        double firstNum = Integer.parseInt(num[0]);
        double secondNum = Integer.parseInt(num[1]);
        double thirdNum = Integer.parseInt(num[2]);
        double result = firstNum * secondNum * thirdNum / 1024 / 1024 / 8;
        System.out.printf("%.2fMB", result);

        1087
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 1;
        while(true){
            if (sum >= num){
                System.out.println(sum);
                break;
            }
            sum += count;
            count++;
        }

        1088
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i <= num; i++) {
            if(i % 3 != 0){
                System.out.print(i + " ");
            }
        }

        1089
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        int thirdNum = Integer.parseInt(num[2]);
        for (int i = 1; i < thirdNum; i++) {
            firstNum += secondNum;
        }
        System.out.println(firstNum);

        1090
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = br.readLine().split(" ");
        int firstNum = Integer.parseInt(num[0]);
        int secondNum = Integer.parseInt(num[1]);
        int thirdNum = Integer.parseInt(num[2]);
        for (int i = 1; i < thirdNum; i++) {
            firstNum *= secondNum;
        }
        System.out.println(firstNum);

 */
    }
}