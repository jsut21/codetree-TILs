import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2001][2001];

        for(int i = 0; i<2; i ++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1+=1000;
            y1+=1000;
            x2+=1000;
            y2+=1000;

            for(int j = x1; j<x2; j++){
                for(int k = y1; k<y2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        for(int i = 0; i<1; i ++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1+=1000;
            y1+=1000;
            x2+=1000;
            y2+=1000;

            for(int j = x1; j<x2; j++){
                for(int k = y1; k<y2; k++){
                    arr[j][k] = 2;
                }
            }
        }

        int count = 0;
        for(int j = 0; j<2001; j++){
            for(int k = 0; k<2001; k++){
                if(arr[j][k] == 1){
                    count++;
                } 
            }
        }

        System.out.print(count);
    }
}