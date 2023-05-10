package DSA;
import java.util.*;
public class Kfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.print("Enter N: ");
        n = sc.nextInt();
        System.out.println();
        System.out.print("Enter k to find kth largest factor of N: ");
        k = sc.nextInt();
        System.out.println(kthFactor(n,k,2));
    }

    public static int kthFactor(int n, int k,int i){
        if (i == n) { // base case
            return i;
        } else {
            if (n%i == 0 || k == 0){
                k--;
                if (k == 0){
                    return i;
                }
                return kthFactor(n,k-1,i+1);
            } else {
                return kthFactor(n,k,i+1);// i is not the factor
            }
        }
    }
}
