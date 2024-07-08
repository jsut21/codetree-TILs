import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[1000000];
        int[] arrB = new int[1000000];
        int tOfa = 0;
        int tOfb = 0;

        for(int i = 0; i<n; i ++){
            int t = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'L'){
                for(int j = 0; j<t; j ++){
                    if(tOfa == 0){
                        arrA[tOfa] = -1;
                    } else {
                        arrA[tOfa] = arrA[tOfa-1] - 1;
                    }
                    tOfa++;
                }
            }

            if(c == 'R'){
                for(int j = 0; j<t; j ++){
                    if(tOfa == 0){
                        arrA[tOfa] = 1;
                    } else {
                        arrA[tOfa] = arrA[tOfa-1] + 1;
                    }
                    tOfa++;
                }
            }
        }

        for(int i = 0; i<m; i ++){
            int t = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'L'){
                for(int j = 0; j<t; j ++){
                    if(tOfb == 0){
                        arrB[tOfb] = -1;
                    } else {
                        arrB[tOfb] = arrB[tOfb-1] - 1;
                    }
                    tOfb++;
                }
            }

            if(c == 'R'){
                for(int j = 0; j<t; j ++){
                    if(tOfb == 0){
                        arrB[tOfb] = 1;
                    } else {
                        arrB[tOfb] = arrB[tOfb-1] + 1;
                    }
                    tOfb++;
                }
            }
        }

        boolean isSamePos = true;
        int count = 0;
        int t = tOfa>tOfb ? tOfb : tOfa;
        for(int i = 0; i<t; i++){
            if(i>0 && arrA[i-1] != arrB[i-1] && arrA[i] == arrB[i]){
                count++;
            }
        }

        System.out.print(count);
    }
}