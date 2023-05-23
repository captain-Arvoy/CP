//code: TestIt
package DSA.DynamicProgramming;
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        int stepIndex = 0, ans = 0;
        System.out.println(waysToClimb(n));
    }
    public static int waysToClimb(int n){

        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }

        return waysToClimb(n-1)+waysToClimb(n-2);

    }
}
