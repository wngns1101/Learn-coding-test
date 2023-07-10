import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
//      3-1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int space = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        String coordinate[] = br.readLine().split(" ");
        for (String splitCoordinate : coordinate) {
            if (splitCoordinate.equals("R")) {
                if (y >= 5) {
                    y = 5;
                }else{
                    y++;
                }
            } else if (splitCoordinate.equals("U")) {
                if (x <= 1) {
                    x = 1;
                }else{
                    x--;
                }
            }else if (splitCoordinate.equals("L")){
                if (y <= 1) {
                    y = 1;
                }else{
                    y--;
                }
            }else{
                if (x >= 5) {
                    x = 5;
                }else{
                    x++;
                }
            }
        }
        System.out.println(x + " " + y);

//      3-2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hour = Integer.parseInt(br.readLine());
        int count = 0;
        for (int h = 0; h <= hour; h++) {
            for (int m = 1; m <= 60; m++) {
                for (int s = 1; s <= 60; s++) {
                    String str = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
                    if (str.contains("3")) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);

//      3-3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String location[] = br.readLine().split("");
        int step[][] = {{-1, 2}, {1, 2}, {-1, -2}, {1, -2}, {-2, 1}, {2, -1}, {-2, -1}, {2, 1} };
        int x = Integer.parseInt(location[1]);
        int y = 0;
        int result = 0;

        if (location[0].equals("a")) {
            y = 1;
        } else if (location[0].equals("b")) {
            y = 2;
        } else if (location[0].equals("c")) {
            y = 3;
        } else if (location[0].equals("d")) {
            y = 4;
        } else if (location[0].equals("e")) {
            y = 5;
        } else if (location[0].equals("f")) {
            y = 6;
        } else if (location[0].equals("g")) {
            y = 7;
        } else {
            y = 8;
        }

        for (int move[]: step) {
            int moveX = x + move[0];
            int moveY = y + move[1];
            if (moveX >= 1 && moveX <= 8 && moveY >= 1 && moveY <= 8) {
                result++;
            }
        }

        System.out.println(result);

        //3-4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size[] = br.readLine().split(" ");

        int map[][] = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        String locaiton[] = br.readLine().split(" ");
        int x = Integer.parseInt(locaiton[0]);
        int y = Integer.parseInt(locaiton[1]);
        int direction = Integer.parseInt(locaiton[2]);

        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};

        for (int i = 0; i < map.length; i++) {
            String line[] = br.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        int count = 1;
        int turnCount = 0;

        while (true) {
            direction -= 1;
            if (direction == -1) {
                direction = 3;
            }
            int moveX = x + dx[direction];
            int moveY = y + dy[direction];

            if(map[moveX][moveY] == 1){
                turnCount += 1;
            }else{
                map[moveX][moveY] = 1;
                count++;
                turnCount = 0;
                x = moveX;
                y = moveY;
            }

            if (turnCount == 4) {
                int backX = x - dx[direction];
                int backY = y - dy[direction];
                if (map[backX][backY] == 1) {
                    break;
                }else{
                    x = backX;
                    y = backY;
                }
            }
        }
        System.out.println(count);
    }
}