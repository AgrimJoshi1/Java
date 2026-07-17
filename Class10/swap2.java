package Class10;

public class swap2 {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,};
        int size = nums.length/2;
        for(int i =0;i<=size+1;i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i++;
        }
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
