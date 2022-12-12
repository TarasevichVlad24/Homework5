package MainTask;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args){
        int[][] arr = {{18,1,71},{21,32,87},{401,99,3}};
        System.out.print("Начальный массив:  ");
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Отсортированный массив:  ");
        for (int[] arr1 : arr) {
            for(int i = 0; i<arr.length;i++){
                Arrays.sort(arr1);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
