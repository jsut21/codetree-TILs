import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0; i<n; i++){
            char c = sc.next().charAt(0);
            int d = sc.nextInt();

            if(c == 'E'){
                x += dx[0]*d;
                y += dy[0]*d;
            }
            
            if(c == 'W'){
                x += dx[1]*d;
                y += dy[1]*d;
            }
            
            if(c == 'S'){
                x += dx[2]*d;
                y += dy[2]*d;
            }
            
            if(c == 'N'){
                x += dx[3]*d;
                y += dy[3]*d;
            }

        }
        System.out.print( x +" " + y);
    }
}