package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Denomination {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] arr = new int[10];
    static int sum;

    public static void input(){
        System.out.print("Enter the array: ");
        arr[0] = 0;
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int permutation() {
        ArrayList<Integer> list = new ArrayList<>();
        int pivot = 1, breadth = 1;
        int sumLocal = 0;
        int combinations = 0;
        while (breadth < n) {
            while (pivot < n) {
                int j = pivot;
                while (sumLocal != sum && j < n) {
                    sumLocal += arr[j];
                    list.add(arr[j]);
                    j++;
                    if (list.size() == breadth){
                        System.out.println("Sum <- " + list);
                        list.clear();
                        sumLocal = arr[pivot];
                        list.add(arr[pivot]);
                    }
                }
                if (sumLocal == sum) {
                    System.out.println("hoii");
                    combinations++;

                }
                list.clear();
                sumLocal = 0;
                pivot++;
            }
            breadth++;
            pivot = 1;
        }
        return combinations;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        n++;
        System.out.print("Enter the sum: ");
        sum = sc.nextInt();
        input();
        System.out.println("Total combinations possible = "+permutation());
    }
}
