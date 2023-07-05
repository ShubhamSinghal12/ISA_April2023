package ExtraClass1;

public class FindLuckyIntegerinAnArray {
	
    public int findLucky(int[] arr) {
        
        int max = -1;
        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j  < arr.length; j++)
            {
                if(arr[j] == arr[i])
                {
                    count++;
                }
            }
            if(count == arr[i] && arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
        
    }
    
public int findLucky2(int[] arr) {
        
        int[] freq = new int[501];
        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]] += 1;
        }
        
        for(int i = freq.length-1; i > 0; i--)
        {
            if(freq[i] == i)
            {
                return i;
            }
        }
        return -1;
    }

}
