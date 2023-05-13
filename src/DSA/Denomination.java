package DSA;

import java.util.Scanner;

public class Denomination {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] arr = new int[10];
    static int sum;

    public static void input(){
        System.out.print("Enter the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void permutation(){
        int i = 0;
        int combinations = 0;
        while(i < arr.length){
            if (arr[i] > n){
                continue;
            }
            int j = 0;
            while ( sum != n && j < 0) {
                sum += arr[j];
                j++;
            }
            if (sum == n){
                combinations++;
            }
            sum = 0;
        }
        System.out.println("Total combinations possible = "+combinations);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();
        input();

    }
}
