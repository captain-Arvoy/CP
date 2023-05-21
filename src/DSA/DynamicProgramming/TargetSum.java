package DSA.DynamicProgramming;
import java.util.*;
//Problem asks Is there a subset that sums to our TargetSum hn? (this question you shall ask when you dry run the table
//and then come across question what does the column signifies.)
//Know the significance of the rows and columns of the tables you make in DP for each problem
public class TargetSum{
    public static void main(String[] args) {
        int weights[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println("The subset = "+knapsack(weights,sum));
    }
    public static boolean knapsack(int[] weights, int sum){
        boolean table[][] = new boolean[weights.length+1][sum+1];
        for(int i = 0; i < weights.length+1; i++){//table base case initialization
            table[i][0] = true;
        }
        /*
         * i: items @column
         * j: weights @rows
         * */
        for(int i = 1; i < weights.length+1; i++) {//table initialization
            for (int j = 1; j < sum + 1; j++) {
                int v = weights[i - 1];
                if (v <= j && table[i][j - v] == true) {//include
                    table[i][j] = true;
                } else if (table[i-1][j] == true){//exclude
                    table[i][j] = true;
                }
            }
        }
        printTable(table);
        return table[weights.length][sum];
    }
    public static void printTable(boolean[][] table){
        for (boolean[] i : table){
            for(int j = 0; j < i.length; j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}