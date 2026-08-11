package Practice.CE2;

public class imageflip {
    class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image[i].length/2; j++){
                int inv = image[i].length-1-j;
                int temp = image[i][j];
                image[i][j] = image[i][inv];
                image[i][inv] = temp;
                 if (image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;

                if (image[i][inv] == 0)
                    image[i][inv] = 1;
                else
                    image[i][inv] = 0;
            }
            if (image[i].length % 2 != 0) {
                int mid = image[i].length / 2;
                if (image[i][mid] == 0)
                    image[i][mid] = 1;
                else
                    image[i][mid] = 0;

        }

    }
        return image;
}
}
    
}



//Approach 2
// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {

//         for (int i = 0; i < image.length; i++) {

//             int left = 0;
//             int right = image[i].length - 1;

//             while (left <= right) {
//                 int temp = image[i][left];

//                 image[i][left] = 1 - image[i][right];
//                 image[i][right] = 1 - temp;

//                 left++;
//                 right--;
//             }
//         }

//         return image;
//     }
// }