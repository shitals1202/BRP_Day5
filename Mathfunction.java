package classwork.Day5;

import java.util.Scanner;

public class Mathfunction{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		System.out.println("Enter the Angle");
		double angle = sc.nextDouble();
		System.out.println("Enter Decimal Value");
		int decimal = sc.nextInt();
		isHarmonicNumber(num);
		isSinAngle(angle);
		isCosAngle(angle);
		toBinary(decimal);
		isSquareRoot(num);
		isPrimeNumber(num);
		isFactorial(num);
		isMinMax();
		stringMinMax();
		sc.close();
	}

	private static void stringMinMax() {
		
	}

	private static void isMinMax() {
		//int [] num = {1,5,-9,3,6,2,8,-2,-4,4,33,-33};
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int n = get.nextInt();
		int [] num = new int[n];
		System.out.println("Enter Elements: ");
		for(int i =0; i<n; i++) {
			num[i]= get.nextInt();
		}
		int maxvalue = num[0];
		for(int i=1;i < num.length;i++){
		    if(num[i] > maxvalue){
		      maxvalue = num[i];
		    }
		  }
		System.out.println("Maximum value is: "+maxvalue);
		
		int minvalue = num[0];
		for(int i=1;i<num.length;i++){
		    if(num[i] < minvalue){
		    	minvalue = num[i];
		    }
		  }
		System.out.println("Minimum value is: "+minvalue);
		get.close();
	}

	private static void isFactorial(int num) {
		int i, fact=1;
		for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }  
		 System.out.println("Factorial of "+num+" is: "+fact); 
	}

	private static void isPrimeNumber(int num) {
		int i,m=0,flag=0;
		m = num/2;
		if(num==0||num==1) {
			System.out.println("This number is not a prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println("This number is not a prime number");
					flag =1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("This number is a prime number");
			}
		}
	}

	private static void isSquareRoot(int num) {
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		 
		System.out.println("The square root of "+num+"is "+sqrtroot);
	}  		
	

	private static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index =0;
		System.out.println("Binary Value of Decimal:");
		while(decimal>0) {
			binary[index++] =decimal%2;
			decimal = decimal/2;
		}
		for(int i =index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
			
	}

	private static void isCosAngle(double angle) {
		double rad;
		rad = angle* (3.14/180);
		System.out.println("Radian : "+rad);
		double radians = Math.toRadians(rad);
		System.out.println("Toradian: "+radians);
		double cos = Math.cos(rad);
		System.out.println("Cos: "+cos);
	}

	private static void isSinAngle(double angle) {
		double rad;
		System.out.println("Trignometric functions are:");
		rad = angle* (3.14/180);
		System.out.println("Radian : "+rad);
		double radians = Math.toRadians(rad);
		System.out.println("Toradian: "+radians);
		double sin = Math.sin(rad);
		System.out.println("Sin: "+sin);
	}

	private static void isHarmonicNumber(int num) {
		double result =0.0;
		System.out.println("Harmonic series is: ");
		while(num>0) {
			result = result +(double)1/num;
			num--;
			System.out.print(result+" ");
			
		}
		System.out.println();
	}
}