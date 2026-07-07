package Class6;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = 8;
        int arr[] = new int[cap];
        for(int i = 0;i<cap;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<cap;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
