package Lec39;

public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(axisOrbit("nitinn"));
	}
	
	public static int axisOrbit(String st)
	{
		int ans = 0;
		//Odd Length SubStrings
		for(int i = 0; i < st.length(); i++)
		{
			ans += 1;
			int si = i-1;
			int ei = i+1;
//			System.out.println(st);
//			System.out.println(si+" "+ei);
			while(si >= 0 && ei < st.length() && st.charAt(si) == st.charAt(ei))
			{
				ans += 1;
				si--;
				ei++;
			}
		}
		
		//Even Length
		for(int i = 0; i < st.length()-1; i++)
		{
			int si = i;
			int ei = i+1;
			while(si >= 0 && ei < st.length() && st.charAt(si) == st.charAt(ei))
			{
				ans += 1;
				si--;
				ei++;
			}
		}
		
		return ans;
	}

}
