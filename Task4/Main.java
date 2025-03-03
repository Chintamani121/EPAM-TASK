package BytesPart2.Task4;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,5},{2,3,4,6}};
        System.out.println(searchMatrix(matrix,4));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null) return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target)  r++;
            else c--;
        }
        return false;
    }
}

