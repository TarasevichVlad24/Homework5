package MainTask;

public class Ex4 {
    public static void main(String[] args){
        int sum = 0;
        int[][] arr1 = {{1,2},{3,4}};
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1.length;j++){
                sum+=arr1[i][j];
            }
        }
        System.out.println("СУММА " + sum);
    }
}
