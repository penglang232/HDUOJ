package Q1005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, B, n;
		long val;

		while (s.hasNext()) {
			A = s.nextInt();
			B = s.nextInt();
			n = s.nextInt();
			long start = System.currentTimeMillis();
			val = f(A, B, n);
			System.out.println((System.currentTimeMillis() - start) + " ms");
			if (val != 8) {
				System.out.println(val);
			}
		}
	}

	public static long f(int A, int B, int n) {
		if (n == 0 || (A == 0 && B == 0)) {
			return 8L;
		}
		int f1, f2, fn;
		f1 = f2 = fn = 1;
		for (int i = 3; i <= n; i++) {
			f1 = f2;
			f2 = fn;
			if (A == 0) {
				fn = (B * f1) % 7;
			} else if (B == 0) {
				fn = (A * f2) % 7;
			} else {
				fn = (A * f2 + B * f1) % 7;
			}

		}
		return fn;
	}
}