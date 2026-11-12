class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int row = 0; row < image.length; row++) {
            int i = 0; 
            int j = image[row].length - 1;
            while(i<j){
                int temp = image[row][i];
                image[row][i] = image[row][j];
                image[row][j] = temp;
                if(image[row][i] == 0) {
                    image[row][i] = 1;
                } else {
                    image[row][i] = 0;
                }
                if(image[row][j] == 0) {
                    image[row][j] = 1;
                } else {
                    image[row][j] = 0;
                }
                i++;
                j--;
            }
            if(i == j) {
                if(image[row][i] == 0) {
                    image[row][i] = 1;
                } else {
                    image[row][i] = 0;
                }
            }
        }
        return image;
    }
}