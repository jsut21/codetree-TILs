import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[1000000];
        int[] arrB = new int[1000000];

        int tOfA = 0;
        int tOfB = 0;

        for(int i = 0; i<n; i ++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j<t; j ++){
                if(tOfA == 0){
                    arrA[tOfA] = v;
                } else {
                    arrA[tOfA] += arrA[tOfA-1] + v; 
                }
                tOfA++;  
            }
        }

        for(int i = 0; i<m; i ++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j<t; j ++){
                if(tOfB == 0){
                    arrB[tOfB] = v;
                } else {
                    arrB[tOfB] += arrB[tOfB-1] + v; 
                }
                tOfB++;  
            }
        }

        int count = 0;
        boolean isALead = false;
        for(int i = 0; i<1000000; i++){
            if(i == 0){
                if(arrA[i] > arrB[i]){
                    isALead = true;
                }

                
                if(arrB[i] > arrA[i]){
                    isALead = false;
                }
            }

            if(i > 0 && arrA[i] > arrB[i] && !isALead){
                isALead = true;
                count++;
            }

            
            if(i > 0 && arrB[i] > arrA[i] && isALead){
                isALead = false;
                count++;
            }

        }

        System.out.print(count);

    }
}