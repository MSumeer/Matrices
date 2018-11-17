import java.util.*;
public class Main {
    public static void main(String[] args){
        int[][] A,B,C;
        int w,h;
        System.out.println("What Would you like to do");
        System.out.println("1:Add Matrices");
        System.out.println("2:Subtract Matrices");
        System.out.println("3:Multiply Matrices");
        System.out.println("");
        int num = input("Please input a number" );
        if(num==1){
            w = input("please input width of matrices");
            h = input("please input height of matrices");
            A = makeMatrices(w,h);
            B = makeMatrices(w,h);
            printMatrices(A);
            printMatrices(B);
            C = addition(A,B);
            printMatrices(C);
        }else if(num == 2){
            w = input("please input width of matrices");
            h = input("please input height of matrices");
            A = makeMatrices(w,h);
            B = makeMatrices(w,h);
            printMatrices(A);
            printMatrices(B);
            C = subtraction(A,B);
            printMatrices(C);
        }else if(num == 3){
            w = input("please input width of matrices");
            h = input("please input height of matrices");
            A = makeMatrices(w,h);
            h = w;
            w = input("please input width of 2nd matrices");
            B = makeMatrices(w,h);
            printMatrices(A);
            printMatrices(B);
            C = multiplication(A,B);
            printMatrices(C);
        }

    }
    private static int[][] multiplication (int[][]A,int[][]B){
        int[][] C = new int[A.length][B[0].length];

        for(int i = 0;i<C.length;i++)
            for (int j = 0; j < C[i].length; j++)
                for (int p = 0; p < A[i].length; p++) {
                    C[i][j] += A[j][p] * B[p][j];
                    System.out.println(j + ":" + A[j][p] + "*" + B[p][j] + " A:");
                }
        return C;
    }
    private static int[][] subtraction(int[][] A,int[][]B){
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j]-B[i][j];
            }
        }
        return C;
    }
    private static int[][] addition(int[][] A,int[][]B){
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0;i<A.length;i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        return C;
    }
    private static void printMatrices(int[][] A){
        for(int i = 0;i<A.length;i++) {
            System.out.print("\n|");
            for (int j = 0; j < A[i].length; j++) {
                if(j<A[i].length-1) {
                    System.out.print(A[i][j] + ",");
                }else{
                    System.out.print(A[i][j]);
                }
            }
            if (i == A.length - 1) {
                System.out.print("|\n");
            } else {
                System.out.print("|");
            }
        }
    }
    private static int[][] makeMatrices(int w, int h){
        int[][] A = new int[h][w];
        for(int i = 0;i<h;i++){
            for(int j = 0;j<w;j++){
                A[i][j] = input("input number for coordinates [" + i + "," + j + "]");
            }
        }
        return A;
    }
    private static int input(String mess){
            System.out.println(mess);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
    }

}
