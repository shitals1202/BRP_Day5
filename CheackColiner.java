package classwork.Day5;

import java.util.Scanner;

public class CheackColiner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		isColinear(x1,y1,x2,y2,x3,y3);
		iscolinearTraingle(x1,y1,x2,y2,x3,y3);
		sc.close();
	}

	private static void iscolinearTraingle(int x1, int y1, int x2, int y2, int x3, int y3) {
		int area =  x1 * (y2-y3) +
					x2 * (y3-y1) +
					x3 * (y1-y2);
		if(area ==0) {
			System.out.println("This lines are colinear");
		}
		else {
			System.out.println("This lines are not colinear");
		}
	}

	private static void isColinear(int x1, int y1, int x2, int y2, int x3, int y3) {
		int slopeAB, slopeBC, slopeAC;
		slopeAB = (y2-y1)/ (x2-x1);
		System.out.println(slopeAB);
		slopeBC = (y3-y2)/(x3-x2);
		System.out.println(slopeBC);
		slopeAC = (y3-y1)/(x3-x1);
		System.out.println(slopeAC);
		if(slopeAB == slopeBC) {
			System.out.println("This lines are colinear");
		}
		else {
			System.out.println("This lines are not colinear");
		}
	}
}