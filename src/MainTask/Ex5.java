package MainTask;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Diogonal1:  ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i][arr.length - i - 1]+" ");
        }
        System.out.println();
        System.out.print("Diogonal2:  ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i][i]+ " ");
        }
    }

}
