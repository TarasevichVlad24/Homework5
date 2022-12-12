package MainTask;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args){
        int [][] arr1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] arr2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] arr3 = new int[arr1.length][arr2.length];
        for (int i =0;i<arr3.length;i++){
            for(int j = 0;j<arr3.length;j++){
                for(int k =0;k<arr1.length;k++){
                    arr3[i][j] = arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr3));
            }
        }


