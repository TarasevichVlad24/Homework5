package MainTask;


import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[][][] arr = new int[2][2][2];
        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][1][0] = 3;
        arr[0][1][1] = 4;
        arr[1][0][0] = 5;
        arr[1][0][1] = 6;
        arr[1][1][0] = 7;
        arr[1][1][1] = 8;
        System.out.print(Arrays.deepToString(arr));
        System.out.println();


        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число:   ");
        a = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int f = 0; f < arr[j].length; f++) {
                    arr[i][j][f]= arr[i][j][f]+a;




                }


            }

        }
        System.out.print(Arrays.deepToString(arr));
    }
}