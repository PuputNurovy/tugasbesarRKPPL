package tubesRkppl.kelas;

import tubesRkppl.itface.PowInterface;

/**
 * @author 
 * Puput Nurovy
 * 113040155
 */
public class D implements PowInterface{

	//Membuat konstruktor class
	public D() {
		System.out.println("Ctor di kelas D");
	}
	
	//Function bawaan class interface PowInterface
	public double pow(double n1, double n2){
		return Math.pow(n1, n2);
	}
	
	//inheritance dari kelas MulAndDivInteface
	public double mul(double n1, double n2){
		return n1*n2;
	}

	//inheritance dari kelas MulAndDivInteface
	public double div(double n1, double n2){
		return n1/n2;
	}
	
	//Membuat function toString
	public String toString(){
		return "toString di kelas D";
	}
}
