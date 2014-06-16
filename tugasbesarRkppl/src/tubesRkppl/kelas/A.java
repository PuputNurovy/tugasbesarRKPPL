package tubesRkppl.kelas;

/**
 * @author 
 * Puput Nurovy
 * 113040155
 */ 

import tubesRkppl.itface.AddAndSubInterface;

public class A implements AddAndSubInterface{

	public A() {
		System.out.println("Ctor di kelas A");
	}
	
	public int add(int n1, int n2){

		//Function bawaan class interface AddAndSubInterface
		return n1+n2;
	}
	
	public int sub(int n1, int n2){

		//Function bawaan class interface AddAndSubInterface
		return n1-n2;
	}
}
