import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for(int i = 0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1; j<x2; j++){
                for(int k = y1; k<y2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        int count = 0;

        for(int j = 0; j<201; j++){
            for(int k = 0; k<201; k++){
                if(arr[j][k] == 1) count ++;
            }
        }

        System.out.print(count);
    }
}