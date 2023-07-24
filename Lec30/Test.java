package Lec30;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "123";
		test(ans);
		System.out.println(ans);

	}
	
	public static void test(String ans)
	{
		if(ans.length() == 0)
			return;
//		ans = ans.substring(1);
		test(ans.substring(1));
		System.out.println(ans);
	}

}
