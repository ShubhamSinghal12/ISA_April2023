package Lec19;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findDuplicate(int[] nums) {
	        
//       int[] count = new int[nums.length];
      
//       for(int i = 0; i < nums.length; i++)
//       {
//           count[nums[i]]++;
//           if(count[nums[i]] == 2)
//               return nums[i];
//       }
//       return -1;
      
      boolean[] count = new boolean[nums.length];
      
      for(int i = 0; i < nums.length; i++)
      {
          if(count[nums[i]] == true)
              return nums[i];
          
          count[nums[i]] = true;
          
      }
      
      return -1;
      
  }

}
