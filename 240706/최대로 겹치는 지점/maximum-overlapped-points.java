import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];
        
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j <= b ; j++){
                arr[j]++;
            }
        }

        int max = 0 ;
        for(int i = 0; i<101; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        System.out.print(arr[max]);
    }
}