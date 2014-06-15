package tubesRkppl.testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import tubesRkppl.kelas.E;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class KelasE {

	//Membuat objek untuk mengakses class E
	E e = new E();

	//TestCase sebelum testing dimulai
	@BeforeTest
	public void beforeTest() {
		System.out.println("mulai testing menggunakan TestNG..");
	}
	
	//TestCase setelah testing selesai
	@AfterTest
	public void afterTest() {
		System.out.println("selesai testing menggunakan TestNG..");
	}
}
