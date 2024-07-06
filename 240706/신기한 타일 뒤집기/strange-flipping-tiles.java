import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100001];
        int currPos = 50000;

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'L'){
                for(int j = 0; j<x; j++){
                    arr[currPos--] = 1;
                }
                currPos++;
            }

            if(c == 'R'){
                for(int j = 0; j<x; j++){
                    arr[currPos++] = -1;
                }
                currPos--;
            }
        }

        int countL = 0;
        int countR = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == -1){
                countR++;
            }

            if(arr[i] == 1){
                countL++;
            }
        }

        System.out.print(countL +" " + countR);
    }
}