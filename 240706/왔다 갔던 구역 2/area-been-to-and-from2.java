import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2001];
        int currPos = 1000;

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'L'){
                for(int j = 0; j<x ;j++){
                    arr[currPos--]++;
                }
            }

            if(c == 'R'){
                for(int j = 0; j<x ;j++){
                    arr[currPos++]++;
                }
            }
        }

        int count = 0;
        for(int i = 0; i<2001; i++){
            if(arr[i] > 1){
                count++;
            }
        }

        System.out.print(count);
    }
}