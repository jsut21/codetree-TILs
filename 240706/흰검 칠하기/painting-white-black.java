import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrW = new int[2001];
        int[] arrB = new int[2001];
        int[] arrG = new int[2001];
        int[] arr = new int[2001];
        int currPos = 1000;

        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'L'){
                for(int j = 0; j<x; j++){
                    if(arrB[currPos] > 1 && arrW[currPos] > 0 ){
                        arrG[currPos]++;
                    }
                    arrW[currPos]++;
                    arr[currPos]= -1;
                    currPos--;
                }
                currPos++;
            }

            if(c == 'R'){
                for(int j = 0; j<x; j++){
                    if(arrB[currPos] > 0 && arrW[currPos] >1){
                        arrG[currPos]++;
                    }
                    arrB[currPos]++;
                    arr[currPos]= 1;
                    currPos++;
                }
                currPos--;
            }
        }

        int countW = 0;
        int countB = 0;
        int countG = 0;

        for(int i = 0; i<2001; i++){
            if(arrG[i] > 0){
                countG++;
            } else if(arr[i] > 0){
                countB++;
            } else if(arr[i] < 0){
                countW++;
            }
        }

        System.out.print(countW +" " + countB +" " + countG);
        
    }
}