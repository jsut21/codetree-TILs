import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        double[] arrA = new double[1000000];
        double[] arrB = new double[1000000];

        // int[] arrN = new int[1000];
        // int[] arrNt = new int[1000];
        // int[] arrM = new int[1000];
        // int[] arrMt = new int[1000];

        // double aPos = 0;
        // double bPos = 0;
        // int maxT = 0;
        int tOfA = 0;
        int tOfB = 0;

        // for(int i = 0 ; i < n ; i++){
        //     arrN[i] = sc.nextInt();
        //     arrNt[i] = sc.nextInt();
        //     maxT+=arrNt[i];
        // }

        // for(int i = 0 ; i < m ; i++){
        //     arrM[i] = sc.nextInt();
        //     arrMt[i] = sc.nextInt();
        // }

        // boolean isALead = false;
        // int count = 0;

        // for(int i = 0; i <maxT; i ++){
        //     aPos += (double)arrN[i]/arrNt[i];
        //     bPos += (double)arrM[i]/arrMt[i];
        // }



        for(int i = 0; i<n; i ++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j<t; j ++){
                arrA[tOfA++] += (double)v/(double)t;
            }
        }

        for(int i = 0; i<m; i ++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j<t; j ++){
                arrB[tOfB++] += (double)v/(double)t;
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