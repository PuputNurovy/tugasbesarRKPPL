package tubesRkppl.kelas;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class C {

	//Membuat variable class
	double n1;
	double n2;
	
	//Membuat konstruktor class
	public C() {
		// TODO Auto-generated constructor stub
		System.out.println("Ctor di kelas C");
		
		n1 = 2;
		n2 = 1;
	}
	
	//Membuat function add yang akan mengembalikan hasil penambahan n1 & n2
	public int add(){
		return (int)(n1+n2);
	}
	
	//Membuat function sub yang akan mengembalikan hasil pengurangan n1 & n2
	public int sub(){
		return (int)(n1-n2);
	}
	
	//Membuat function mul yang akan mengembalikan hasil perkalian n1 & n2
	public double mul(){
		return n1*n2;
	}
	
	//Membuat function div yang akan mengembalikan hasil pembagian n1 & n2
	public double div(){
		return n1/n2;
	}
	
	//Membuat function toString
	public String toString(){
		return "toString di kelas C";
	}
}
