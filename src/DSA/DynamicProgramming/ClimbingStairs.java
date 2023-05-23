//code: TestIt
package DSA.DynamicProgramming;
import java.util.*;
public class ClimbingStairs {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();

        int stepIndex = 0;
        waysToClimb(n,stepIndex);
        System.out.println(ans);
    }
    public static void waysToClimb(int n, int stepIndex){
        if (stepIndex == n){
            ans++;
        }
        if (stepIndex > n){
            return;
        }

        waysToClimb(n, stepIndex+1);
        waysToClimb(n,stepIndex+2);
    }
}
