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
	
	// fungsi untuk mengembalikan perkalian 2 nilai
	public double mul(double n1, double n2){
		
		return n1*n2;
	}

	// fungsi untuk mengembalikan pembagian 2 nilai
	public double div(double n1, double n2){

		return n1/n2;
	}

}
