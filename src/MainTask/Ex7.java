package MainTask;


public class Ex7 {
    public static void main(String [] args){
        int[][] arr = new int[7][7];
        for (int i = 0;i<arr.length/2 +1;i++){
            for(int j = i;j<arr.length-i;j++){
                arr[i][j] =1;
                arr[arr.length-i-1][j] =1;
            }

        }

        for(int [] string: arr){
            for(int value: string){
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}
