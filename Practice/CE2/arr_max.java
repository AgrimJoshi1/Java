package Practice.CE2;

public class arr_max {
    public static void main(String[] args) {
        int[] arr = {10,30,50,90,70,55,100};

        int max = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    
        
    }
    
}
