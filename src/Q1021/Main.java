package Q1021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		long val;

		while (s.hasNext()) {
			n = s.nextInt();
			//long start = System.currentTimeMillis();
			val = f(n);
			System.out.println(val);
			System.out.println(val%3 == 0 ? "yes" : "no");
			//System.out.println((System.currentTimeMillis() - start) + " ms");
		}
	}

	public static long f(int n) {
		if (n == 0) {
			return 7L;
		}
		if (n == 1) {
			return 11L;
		}
		int f1, f2, fn;
		f1 = 7;
		f2 = 11;
		fn = 0;
		for (int i = 2; i <= n; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}
}