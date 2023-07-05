package Lec23;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
        int n[]={9,4,3,6};
        int m[]={9,9,7,8,2};
        System.out.println(sum(n,m));
    }
	
    public static ArrayList<Integer> sum(int []n, int[]m){
        ArrayList<Integer> ans=new ArrayList<>();
        int c=0;
        int i = n.length-1;
        int j = m.length-1;
        while(i>=0 || j>=0){
            int sum=c;
            if(i>=0){
                sum+=n[i];
                i--;
            }
            if(j>=0){
                sum+=m[j];
                j--;
            }
            ans.add(0,sum%10);
            c=sum/10;
        }
        if(c==1){
            ans.add(0,1);
        }
        //       Collections.reverse(ans);
        return ans;
    }
}
