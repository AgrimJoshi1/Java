package Practice;

import java.util.Scanner;

public class matrixmult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int T = sc.nextInt();

while (T-- > 0) {
    int R1 = sc.nextInt();
    int C1 = sc.nextInt();

    int[][] A = new int[R1][C1];

    for (int i = 0; i < R1; i++) {
        for (int j = 0; j < C1; j++) {
            A[i][j] = sc.nextInt();
        }
    }

    int R2 = sc.nextInt();
    int C2 = sc.nextInt();

    int[][] B = new int[R2][C2];

    for (int i = 0; i < R2; i++) {
        for (int j = 0; j < C2; j++) {
            B[i][j] = sc.nextInt();
        }
    }
    int arr2 [][] = new int [R1][C2];
    for(int i = 0; i<R1;i++){
        for(int j =0; j<C2;j++){
            for(int k = 0; k<C1;k++){
                arr2[i][j] += A[i][k]*B[k][j];
            }
        }
    }
    for(int i = 0; i<R1;i++){
        for(int j = 0; j<C2; j++){
            System.out.print(arr2[i][j] + " ");
        }

        System.out.println();
    }
}
sc.close();
        
    }
}
