package Q1006;

import java.util.Scanner;

public class Main_old {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int D;
		while (s.hasNext()) {
			D = s.nextInt();
			if(D == -1) break;
			if(D >= 0 && D <= 120) {
				int happy = 0;
				double alpha = 0;
				double beta = 0;
				double gama = 0;
 				for(int h=0;h<12;h++) {
 					for(int m=0;m<60;m++) {
 						for(int sec=0;sec<60;sec++) {
 							alpha = Math.abs((h*3600 + m*60+sec)/120.0 - 6*sec);
 		 					alpha = alpha > 180 ? 360 - alpha : alpha;
 		 					if(alpha<D) {
 		 						System.out.println("alpha: "+alpha);
 		 						continue;
 		 					}
 		 					beta = Math.abs((m*60+sec)/10.0 - 6*sec);
 		 					beta = beta > 180 ? 360 - beta : beta;
 		 					if(beta<D) {
 		 						System.out.println("beta: "+beta);
 		 						continue;
 		 					}
 		 					gama = Math.abs((h*3600 + m*60+sec)/120.0 - (m*60+sec)/10.0);
 		 					gama = gama > 180 ? 360 - gama : gama;
 		 					if(gama<D) {
 		 						System.out.println("gama: "+gama);
 		 						continue;
 		 					}
 		 					happy ++ ;
 						}
 					}
				}
 				System.out.println(String.format("%.3f", happy / 432.0));
			}
		}
	}
}