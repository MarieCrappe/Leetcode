package Easy;

public class MoveZeroes {

    
	public static void main(String[] args) {
		int[] nums = {1,2,0,3};
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {
        
    	int size = nums.length;
    	int[] newNums = new int[size];
    	int index = 0;
    	
    	for (int i = 0; i < size; i++) {
    		if (nums[i] != 0) {
    			newNums[index] = nums[i];
    			index ++;
    		}
    	}    	
    	
    	return newNums;
    	
    }
}