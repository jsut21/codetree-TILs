import java.util.Scanner;

public class Main {
    public static boolean inbound(int x, int y, int n){
        return 0 <=x && x<= n-1 && 0<= y && y<= n-1;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i ++){
            for(int j = 0; j<n; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0 ;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        for(int i = 0; i<n; i ++){
            for(int j = 0; j<n; j ++){
                int tempCount = 0;
                for(int k = 0; k< 4; k++){
                    int nx = j+dx[k];
                    int ny = i+dy[k];
                    if(inbound(nx,ny,n) && arr[nx][ny] == 1){
                        tempCount ++;
                    }
                }
                if(tempCount > 2){
                    count++;
                }
                
            }
        }

        System.out.print(count);
    }
}