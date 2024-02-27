import java.util.Scanner;

class Complex
{
	private double real;
	private double imag;

	//default constructore 
	public Complex(){
		this.real=0.0;
		this.imag=0.0;
	}

	//parameterized constructore 
	public Complex(double real , double imag){
		this.real=real;
		this.imag=imag;
	}
	//addition of two complex numbers 
	public Complex add(Complex other){
		double newReal = this.real+other.real;
		double newImag = this.imag+other.imag;
		return new Complex(newReal,newImag);
	}

	//substraction of two complex numbers 
	public Complex subtract(Complex other){
		double newReal=this.real-other.real;
		double newImag=this.real-other.imag;
		return new Complex(newReal,newImag);
	}

	//multiplication of two Complex numbers
	public Complex multiply(Complex other){
		double newReal = (this.real*other.real)-(this.imag*other.imag);
		double newImag = (this.real*other.imag)+(this.imag*other.imag);
		return new Complex(newReal,newImag);
	}

	//displaythe complex numbers
	public void display(){
		System.out.println("Complex Number : "+this.real +"+"+this.imag+"i");
	}
}
class Main
{
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);

		//first complex number
		System.out.println("Enter the real part of the first  complex number :");
		double real1=scanner.nextDouble();
		System.out.println("Enter the imaginary part of the first complex number :");
		double imag1=scanner.nextDouble();

		//second complex number 
		System.out.println("Enter the real part of second the complex number :");
		double real2=scanner.nextDouble();
		System.out.println("Enter the imaginary part of second complex number :");
		double imag2=scanner.nextDouble();

		//creating complex number 
		Complex complex1=new Complex(real1,imag1);
		Complex complex2=new Complex(real2,imag2);

		//performing arithmetic operation 
		Complex sum=complex1.add(complex2);
		Complex difference=complex1.subtract(complex2);
		Complex product=complex1.multiply(complex2);

		//Displaying result 
		System.out.println("\nSum :");
		sum.display();
		System.out.println("\nDifference :");
		difference.display();
		System.out.println("\nProduct :");
		product.display();

		//close the scanner 
		scanner.close();
	}
}