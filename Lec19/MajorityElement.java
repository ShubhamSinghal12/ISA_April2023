package Lec19;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int majorityElement(int[] nums) {
        
        int temp = nums[0];
        int ct = 1;
        for(int i = 1; i < nums.length;i++)
        {
            if(temp == nums[i])
            {
                ct++;
            }
            else
            {
                ct--;
            }
            if(ct == 0)
            {
                temp = nums[i];
                ct = 1;
            }
        }
        return temp;
        
        
    }

}
