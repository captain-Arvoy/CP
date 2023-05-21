package DSA.DynamicProgramming;
import java.util.*;
//Problem asks Is there a subset that sums to our TargetSum hn? (this question you shall ask when you dry run the table
//and then come across question what does the column signifies.)
//Know the significance of the rows and columns of the tables you make in DP for each problem
public class TargetSum{
    public static void main(String[] args) {
        int weights[] = {4, 2, 7, 1, 3};
        int value[] = {15,14,10,45,30};
        System.out.println("Max profit = "+knapsack(weights,value));
    }
    public static int knapsack(int[] weights, int[] value){
        int table[][] = new int[weights.length+1][value.length+1];
        for(int i = 0; i < weights.length+1; i++){//table base case initialization
            table[i][0] = 0;
            table[0][i] = 0;
        }
        /*
         * i: items @column
         * j: weights @rows
         * */
        for(int i = 1; i < value.length+1; i++) {//table initialization
            for (int j = 1; j < weights.length + 1; j++) {
                if (weights[i - 1] <= j) {//include
                    table[i][j] = Math.max(value[i-1]+table[i][j - weights[i-1]], table[i][j-weights[i-1]]);
                } else {//exclude
                    table[i][j] = table[i-1][j];
                }
            }
        }
        printTable(table);
        return table[weights.length][value.length];
    }
    public static void printTable(int[][] table){
        for (int[] i : table){
            for(int j = 0; j < i.length; j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}