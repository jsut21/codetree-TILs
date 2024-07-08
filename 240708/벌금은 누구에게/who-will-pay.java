import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n+1];

        boolean isStudentGetPenalty = false;
        for(int i = 0; i<m; i ++){
            int temp = sc.nextInt();
            students[temp]++;
            if(students[temp] >= k){
                isStudentGetPenalty = true;
                System.out.print(temp);
                break;
            }
        }

        if(!isStudentGetPenalty){
            System.out.print(-1);
        }
        
    }
}