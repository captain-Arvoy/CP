package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Nhouse {
    public static void main(String[] args) {
        int houses[] = {6,7,1,3,8,2,5};
        int sortedHouses[][] = selectionSort(houses);
        maxSum(sortedHouses);
    }
    public static void maxSum(int sortedHouses[][]){ //finding maximum sum of value of the houses
        int sum = 0;
        ArrayList<Integer> indxList = new ArrayList<>();
        for(int i = 0; i < sortedHouses[0].length; i++){
            int j = 0;
            Boolean flag = true;
            while (j <= i && j < indxList.size()){
                if ((indxList.isEmpty()) != true && Math.abs(indxList.get(j) - sortedHouses[0][i]) == 1){
                    flag = false;
                    break;
                }
                j++;
            }
            if (flag){
                indxList.add(sortedHouses[0][i]);
                sum += sortedHouses[1][i];
            }
        }
        System.out.println(sum);
    }
    public static int[][] selectionSort(int houses[]){
        int sortedHouses[][] = {{0,1,2,3,4,5,6},houses.clone()};
        for (int i = 1; i < houses.length; i++) {
            int key[] = {sortedHouses[1][i],i};
            int j = i - 1;
            while (j >= 0 && (sortedHouses[1][j] < key[0])){
                sortedHouses[1][j + 1] = sortedHouses[1][j];
                sortedHouses[0][j+1] = sortedHouses[0][j];
                j--;
            }
            sortedHouses[1][j+1] = key[0];
            sortedHouses[0][j+1] = key[1];
        }
        return sortedHouses;
    }
}
