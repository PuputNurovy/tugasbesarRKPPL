package

/**
 * @author 
 * Puput Nurovy
 * 113040155
 */ 

tubesRkppl.kelas;

import tubesRkppl.itface.MulAndDivInterface;

public class B implements MulAndDivInterface{

	public B() {
		System.out.println("Ctor di kelas B");
	}
	
	//Function bawaan class interface MulAndDivInterface
	public double mul(double n1, double n2){
		
		return n1*n2;
	}

	//Function bawaan class interface MulAndDivInterface
	public double div(double n1, double n2){

		return n1/n2;
	}

	//Membuat function toString
		public String toString(){
			return "toString di kelas B";
		}
}
