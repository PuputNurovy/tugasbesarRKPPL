package tubesRkppl.kelas;

/**
 * @author 
 * Puput Nurovy
 * 113040155
 */ 

import tubesRkppl.itface.AddAndSubInterface;

public class A implements AddAndSubInterface{

	public A() {
		System.out.println("Ctor di kelas B");
	}
	
	public int add(int n1, int n2){

		// fungsi untuk mengembalikan pertambahan 2 nilai
		return n1+n2;
	}
	
	public int sub(int n1, int n2){

		// fungsi untuk mengembalikan pengurangan 2 nilai
		return n1-n2;
	}
}
