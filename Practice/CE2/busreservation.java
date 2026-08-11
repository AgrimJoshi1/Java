package Practice.CE2;
import java.util.*;

public class busreservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] seats = new int[5][4];
        int n = sc.nextInt(); //no. of reservations
        for(int i = 0; i<n; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();

            seats[row-1][col-1] = 1;

        }
        System.out.println("Seat Layout");

        for(int i = 0; i<5;i++){
            for(int j = 0; j<4;j++){
                System.out.print(seats[i][j]+ " "); // Seat Layout

            }
            System.out.println();
        }
        int reserved = 0; 
        for(int i = 0; i<5; i++){
            for(int j = 0; j<4;j++){
                if(seats[i][j]==1){
                    reserved++;
                }
            }
        }
        int available = 20 - reserved;

        System.out.println("Reserved Seats = "+ reserved);
        System.out.println("Available Seats = "+ available);

        sc.close();
    }



    
}
