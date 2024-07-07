import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = 1;
        boolean isPositive = arr[0] >0 ? true: false;
        for(int i = 1; i<n; i++){
            if(arr[i] > 0){
                if(isPositive == true){
                    count++;
                    if(max < count){
                        max = count;
                    }
                }else{
                    count = 1;
                    isPositive = true;
                }
            }

            if(arr[i] < 0){
                if(isPositive == false){
                    count++;
                    if(max < count){
                        max = count;
                    }
                }else{
                    count = 1;
                    isPositive = false;
                }
            }
        }
        System.out.print(max);
    }
}