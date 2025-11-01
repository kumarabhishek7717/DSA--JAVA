public class trappedwater {
    public static int trappedwater(int height []){
        int n = height.length;
        // calculate leftmax boundary - array
        int leftmax [] = new int [n];
         leftmax[0] =  height[0];
         for (int i =1; i<n; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
         } 
         // calculate rightmax boundary - array
            int rightmax [] = new int[n];
            rightmax[n-1] = height[n-1];
            for (int i = n-2; i>=0; i--){
                rightmax[i] = Math.max(height[i] , rightmax[i+1]);
            }
            // calculate trapped water
            int trappedwater = 0;
            for (int i= 0 ; i<n; i++){
                // waterlevel = min (leftmax , rightmax)
                int waterlevel = Math.min(leftmax[i] , rightmax[i]);
                // trapped water = waterlevel - height[i]
                trappedwater += waterlevel - height[i];

            }
            return trappedwater;
          }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));

    }
    
} 


public class trappedwater {
    public static int trappedwater(int height []){
        int n = height.length;

        int leftmax [] = new int [n];
        leftmax[0] = height[0];
        for (int i = 1; i<n ; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        int rightmax [] = new int [n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }
        int trappedwater =0;
        for (int i = 0; i<n; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height [] = {3,4,5,6,7,8,9,1,23,5,1};
        System.out.println(trappedwater(height));

    }
} 


 public class trappedwater {
    public static int trapped(int height[]){
        int n = height.length;

        int leftmax [] = new int [n];
        leftmax[0] = height[0];
        for (int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        int rightmax [] = new int [n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);

        }
         int trappedwater = 0;
         for (int i = 0 ; i<n ; i++){
            int waterlevel = Math.min (leftmax[i] , rightmax[i]);
            trappedwater += waterlevel - height[i];
         }
         return trappedwater;
    }
 
    public static void main(String[] args) {
        int height [] = {3,0,2,0,4};
        System.out.println(trapped(height));
    }
 } 


 public class trappedwater {
    public static int trapped (int height []){
        int n = height.length;

        int leftmax [] = new int [n];
        leftmax[0] = height[0];
        for (int i =1; i<n; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);

        }
        int rightmax [] = new int [n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);

        }

        int trappedwater = 0;
        for (int i = 0; i<n; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
           trappedwater += waterlevel - height[i];   
        }
        return trappedwater;
    }
 
    public static void main(String[] args) {
        int height [] = {2,2,2,2};
        System.out.println(trapped(height));

    }
 }