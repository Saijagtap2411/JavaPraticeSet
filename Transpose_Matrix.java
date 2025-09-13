package JavaPraticeQuestions;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        display(matrix);
        int[][]trans=new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        display(trans);
    }
    public static void display(int[][] matrix){
        for(int[] row:matrix){
            for(int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
