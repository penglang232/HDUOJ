package Q1006;

import java.util.Scanner;
// 抄作业
public class Main {
	public class Section{
		double a;
		double b;
	}

	static int D;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			D = s.nextInt();
			if(D == -1) break;
			if(D >= 0 && D <= 120) {
				double happy = 0D;
 				for(int h=0;h<12;h++) {
 					for(int m=0;m<60;m++) {
						Section[][] S = new Section[3][];
						S[0] = new Section[2];
						S[1] = new Section[2];
						S[2] = new Section[2];
					    // 获得基本解区间
					    double a, b;
					    a = 30.0 * h - 5.5 * m;
					    b = 11.0/120;
					    S[0][0] = dofunc1(a,b);
					    S[0][1] = dofunc2(a,b);
					    a = 30.0 * h + 0.5 * m;
					    b = 719.0/120;
					    S[1][0] = dofunc1(a,b);
					    S[1][1] = dofunc2(a,b);
					    a = 6.0 * m;
					    b = 5.9;
					    S[2][0] = dofunc1(a,b);
					    S[2][1] = dofunc2(a,b);
					    // 将解集转化为区间的并，并累计“快乐时光”的长度
						for (int i = 0; i < 2; i++)
							for (int j = 0; j < 2; j++)
								for (int k = 0; k < 2; k++) {
									Section rSec = doIntersection(doIntersection(S[0][i], S[1][j]), S[2][k]);
									happy += rSec.b - rSec.a;
								}
 					}
				}
 				System.out.println(String.format("%.3f", happy / 432.0));
			}
		}
	}
	
	public static Section doIntersection(Section a,Section b) {
		Section s = new Main().new Section();
		s.a = a.a > b.a ? a.a : b.a;
		s.b = a.b < b.b ? a.b : b.b;
		if(s.a >= s.b) {
			s.a = s.b = 0D;
		}
		return s;
	}
	
	// 从 D <= bS - a <= D1 中解出区间
	public static Section dofunc1(double a, double b) {
		Section sec = new Main().new Section();
		sec.a = (D + a) / b;
		sec.b = (360.0 - D + a) / b;
		if (sec.a < 0.0)
			sec.a = 0.0;
		if (sec.b > 60.0)
			sec.b = 60.0;
		if (sec.a >= sec.b)
			sec.a = sec.b = 0.0;
		return sec;
	}

	// 从 D <= a - bS <= D1 中解出区间
	public static Section dofunc2(double a, double b) {
		Section sec = new Main().new Section();
		sec.a = (a + D - 360.0) / b;
		sec.b = (a - D) / b;
		if (sec.a < 0.0)
			sec.a = 0.0;
		if (sec.b > 60.0)
			sec.b = 60.0;
		if (sec.a >= sec.b)
			sec.a = sec.b = 0.0;
		return sec;
	}
}