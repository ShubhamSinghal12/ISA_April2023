package Lec37;

public class Test {
	
	public static void main(String[] args) {
	      int n = 50;
	      printPrime(n);
		}

		public static void printPrime(int n) {
			   for(int i = 2; i<= n; i++) {
				if(checkPrime(i) == true) {
					System.out.print(i+" ");
				}
			}
		}

		public static boolean checkPrime(int n) {
		    boolean flag = true;
			for(int i = 2; i*i <= n; i++) {
				if(n%i == 0) {
					flag = false;
					break;
				}
			}
			return flag;
		}

}
