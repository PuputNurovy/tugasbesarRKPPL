package tubesRkppl.kelas;

import tubesRkppl.itface.PowInterface;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class D implements PowInterface{

	//Membuat konstruktor class
	public D() {
		// TODO Auto-generated constructor stub
		System.out.println("Ctor di kelas D");
	}
	
	//Function bawaan class interface PowInterface
	public double pow(double n1, double n2){
		return 0;
	}
	
	//Membuat function toString
	public String toString(){
		return "toString di kelas D";
	}
}
