package Lec25;

public class StringVsStringBuilderTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		long start = System.currentTimeMillis();
//		String st = "";
//		for(int i = 1; i <= 1000000; i++)
//		{
//			st = st+"a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
		
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 1000000; i++)
		{
			sb.append("a");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
