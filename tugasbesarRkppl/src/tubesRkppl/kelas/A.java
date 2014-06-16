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

	//Function bawaan class interface AddAndSubInterface
	public int add(int n1, int n2){

		return n1+n2;
	}

	//Function bawaan class interface AddAndSubInterface
	public int sub(int n1, int n2){

		return n1-n2;
	}
}
