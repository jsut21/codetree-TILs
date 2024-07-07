import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];

        int count = 0;
        int max = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

            if(i>0 && arr[i] >t ){
                count++;
            } else {
                count = 0;
            }

            if(count > max){
                max = count;
            }
        }

        System.out.print(max);
    }
}