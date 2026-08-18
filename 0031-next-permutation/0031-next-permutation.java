class Solution {
    public void nextPermutation(int[] nums) {
        // find the pivot 
        int pivot = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        // if array is allreading in largest form (desending order)
            if(pivot == -1){
              int i = 0;
               int j = n-1;

               while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                i++;
                j--;
               }
               return;
            }
        
        // next largest element from right
        for (int i = n-1; i>=pivot; i--){
           if(nums[i] > nums[pivot]){

            int temp = nums[i];
            nums[i] = nums[pivot];
            nums[pivot] = temp;
             break;
           }
        }

        // reverse from pivot+1 to n-1 or suffix
        int i = pivot +1;
        int j = n-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}