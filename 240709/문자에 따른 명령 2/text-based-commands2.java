import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int x = 0;
        int y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dir = 3;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'L'){
                dir = (dir+3) % 4;
            }
            if(str.charAt(i) == 'R'){
                dir = (dir+1) % 4;
            }
            if(str.charAt(i) == 'F'){
                x += dx[dir];
                y += dy[dir];
            }
            
        }

        System.out.print(x +" " + y);
    }
}