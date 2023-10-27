// Troy Zhang 
// I pledge my honor that I have abided by the Stevens Honor System. 
package timecomplexity;

public class complexity {
	
	// a method that has time complexity O(n^2).
	public static void method1(int n) {
		int counter = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.println (" Operation "+ counter );
				counter++;
			}
		}
	
	}
	
	// a method that has time complexity O(n^3).
	public static void method2(int n) {
		int counter = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<n; k++) {
					System.out.println (" Operation "+ counter );
					counter++;
				}
			}
		}
	}
	
	// a method that has time complexity O(log(n)).
	public static void method3(int n) {
		int counter = 0;
		for (int i=1; i<n; i*=2) {

			System.out.println (" Operation "+ counter );
			counter++;
		}
	}

	// a method that has time complexity O(nlog(n)).
	public static void method4(int n) {
		int counter = 0;
		for (int i=0; i<n; i++) {
			for (int j=1; j<n; j*=2) {
				System.out.println (" Operation "+ counter );
				counter++;
			}
		}
	}

	//a method that has time complexity O(log log n).
	public static void method5(int n) {
		if (n <= 1) return;

		int m = (int)(Math.log(n) / Math.log(2));

		for (int i = 2; i <= m; i++) {
			System.out.print(i + " ");
		}
	}

	// a method that has time complexity O(2n).
	public static int method6(int n) {
		if (n <= 1) return 1;

		return method6(n-1) + method6(n-1);
	}


	public static boolean bSearch(int[] a, int x) {
		int end = a.length - 1;
		int start = 0;
		while (start <= end) {
			int mid = (end - start) / 2 + start;
			if (a[mid] == x) return true;
			else if (a[mid] > x) end = mid - 1;
			else start = mid + 1;
		}
		return false;
	}
	
	/*
	 * For length of a = 32: 
	 * 
	 * Iteration | start | end
	 * --------------------------
	 *     1     |   0   |  31
	 *     2     |  16   |  31
	 *     3     |  24   |  31
	 *     4     |  28   |  31 
	 *     5     |  30   |  31
	 *     6     |  31   |  31
	 *      
	 *     
	 *     
	 *     
	 * For length of a = 64:
	 * 
	 * Iteration | start | end
	 * --------------------------
	 *     1     |   0   |  63
	 *     2     |  32   |  63
	 *     3     |  48   |  63
	 *     4     |  56   |  63
	 *     5     |  60   |  63
	 *     6     |  62   |  63
	 *     7     |  63   |  63
	 *  
	 *     
	 *     
	 *  What is the relation between the size n of a and the number of iterations?
	 *  
	 *  Based on the two tables completed above, we can see a positive trend between 
	 *  an increase in size n of a and the total number of iterations. In other words, 
	 *  as the size n of a increases, the number of iterations increases. 
	 *  
	 *  What is the time complexity of bSearch?
	 *  O(log(n))
	 *  
	 */

	public static void main(String[] args) {
		int n = 5;
		method3(n);

	}


}



