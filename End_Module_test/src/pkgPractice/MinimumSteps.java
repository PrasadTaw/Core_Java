package pkgPractice;

import java.util.Scanner;

public class MinimumSteps {

	public static boolean arreql(int[] a) {

		int i;
		boolean flag = true;

		for (i = 1; i < a.length; i++) {

			if (a[0] != a[i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int min(int[] a) {

		int min = a[0], mindex = 0;
		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];
				mindex = i;
			}
		}
		return mindex;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, steps = 0;

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {

			b[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) {

			c[i] = a[i];
		}

		do {

			int mindex = min(a);
			for (i = 0; i < n; i++) {

				if (a[i] > a[mindex]) {
					int temp = 0;
					temp = a[i] - a[mindex];
					if (temp % b[i] == 0) {
						
						c[i] = a[mindex];
						steps += temp / b[i];
//						if(temp / b[i] == 0) {
//							System.out.println("-1");
//							return;
//						}
					}

				}
			} // for
			
			if (arreql(a)) {
				System.out.println(steps);
			}
//			else {
//				
//				//if(a[mindex] > b[mindex])
//				{
//					
//					
//				}
//			}

		} while (!(arreql(a)));

	}

}
