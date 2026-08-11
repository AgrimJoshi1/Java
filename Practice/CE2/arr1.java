package Practice.CE2;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr = {10,20,30};
        for(int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i]);

        }
        sc.close();
        
        
        
    }
    
    
}
