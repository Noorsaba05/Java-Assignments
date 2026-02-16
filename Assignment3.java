import java.util.Scanner;

interface Area{
	final static double pi = 3.14;
	
	double compute(double x, double y);
}

class Rectangle implements Area{
	public double compute(double x, double y){
		return x*y;
	}
}

class Circle implements Area{
	public double compute(double x, double y){
		return pi*x*x;
	}
}

class Assignment3{
	public static void main(String args[]){
		Rectangle R1 = new Rectangle();
		Circle c1 = new Circle();
		
		Area A1 = R1;
		Area A2 = c1;
		System.out.println("Area of Rectangle is:"+A1.compute(20,10));
		System.out.println("Area of Circle is:"+A2.compute(20,20));
	
	}
}
