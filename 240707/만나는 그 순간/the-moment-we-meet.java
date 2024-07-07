import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrN = new int[1000];
        int[] arrM = new int[1000];

        int nCount = 0;
        int mCount = 0;
        for(int i = 0; i<n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for(int j = 0; j<t; j++){
                if(d == 'L'){
                    if(nCount > 0){
                        arrN[nCount] = arrN[nCount-1] -1;
                        nCount++;
                    } else {
                        arrN[nCount++] = -1;
                    }
                }

                if(d == 'R'){
                    if(nCount > 0){
                        arrN[nCount] = arrN[nCount-1] +1;
                        nCount++;
                    } else {
                        arrN[nCount++] = 1;
                    }
                }
            }
        }

        for(int i = 0; i<m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for(int j = 0; j<t; j++){
                if(d == 'L'){
                    if(mCount > 0){
                        arrM[mCount] = arrM[mCount-1] -1;
                        mCount++;
                    } else {
                        arrM[mCount++] = -1;
                    }
                }

                if(d == 'R'){
                    if(mCount > 0){
                        arrM[mCount] = arrM[mCount-1] +1;
                        mCount++;
                    } else {
                        arrM[mCount++] = 1;
                    }
                }
            }
        }

        boolean isMeet = false;
        for(int i = 0; i<nCount; i++){
            if(arrM[i] == arrN[i]){
                System.out.print(i+1);
                isMeet = true;
                break;
            }
        }

        if(isMeet == false){
            System.out.print(-1);
        }
    }
}