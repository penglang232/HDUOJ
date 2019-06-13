package Q1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = 0;
        if (s.hasNext()) {
            T = s.nextInt();
        }
        for (int i = 0; i < T; i++) {
            int subSum, maxSum,n , first = 0, last = 0, temp = 1;
            subSum = 0;
            maxSum = -1001;
            n = s.nextInt();
            for (int j = 0; j < n; j++) {
                subSum += s.nextInt();
                if (subSum > maxSum) {
                    maxSum = subSum;
                    first = temp;
                    last = j + 1;
                }
                if (subSum < 0) {
                    subSum = 0;
                    temp = j + 2;
                }
            }
            System.out.println("Case " + (i + 1) + ":");
            System.out.println(maxSum + " " + first + " " + last);
            if (i != (T - 1)) {
                System.out.println();
            }
        }
        s.close();
    }

	public static int MaxSubSequence(int A[], int N) {
		int subSum, maxSum, j, first = 0, last = 0, temp = 1;
		subSum = 0;
		maxSum = -1001;
		for (j = 0; j < N; j++) {
			subSum += A[j];
			if (subSum > maxSum) {
				maxSum = subSum;
				first = temp;
				last = j + 1;
			}
			if (subSum < 0) {
				subSum = 0;
				temp = j + 2;
			}
		}
		System.out.println(maxSum + " " + first + " " + last);
		return maxSum;
	}



	public static int maxSum(int A[], int n) {
		int dp[] = new int[n];
		int sum;
		int index = 0;
		dp[0] = A[0];
		for (int i = 1; i < n; i++) {
			dp[i] = max(A[i], A[i] + dp[i - 1]);
		}
		// System.out.println(Arrays.toString(dp));
		sum = dp[0];
		for (int i = 0; i < n; i++) {
			if (dp[i] > sum) {
				sum = dp[i];
				index = i;
			}
		}
		// System.out.println(index);
		return sum;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

}