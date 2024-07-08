import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();

        int[] handshake = new int[n+1];
        boolean[] isInfected = new boolean[n+1];
        int[][] arrT = new int[251][2];

        isInfected[p] = true;

        for(int i = 0; i<t; i++){
            int tt = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            arrT[tt][0] = x;
            arrT[tt][1] = y;
        }

        for(int i = 1; i<=250; i ++){
            if(isInfected[arrT[i][0]] || isInfected[arrT[i][1]]){
                if(isInfected[arrT[i][0]] && handshake[arrT[i][0]] < k){
                    handshake[arrT[i][0]] += 1;
                }
                if(isInfected[arrT[i][1]] && handshake[arrT[i][1]] < k){
                    handshake[arrT[i][1]] += 1;
                }
                isInfected[arrT[i][0]] = true;
                isInfected[arrT[i][1]] = true;
            }
        }

        for(int i = 0; i<n; i ++){
            if(isInfected[i]){
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            
        }
    }
}