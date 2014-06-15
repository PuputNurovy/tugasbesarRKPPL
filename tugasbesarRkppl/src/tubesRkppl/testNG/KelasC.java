package tubesRkppl.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tubesRkppl.kelas.C;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class KelasC {
	
	//Membuat objek untuk mengakses class C
	C c = new C();

	//TestCase sebelum testing dimulai
	@BeforeTest
	public void beforeTest() {
		System.out.println("mulai testing menggunakan TestNG..");
	}
	
	//TestCase untuk mencocokan hasil function add dengan nilai 3 yg seharusnya muncul
	@Test
	public void test1(){
		Assert.assertEquals(c.add(), 3);
	}

	//TestCase untuk mencocokan hasil function sub dengan nilai 1 yg seharusnya muncul
	@Test
	public void test2(){
		Assert.assertEquals(c.sub(), 1);
	}

	//TestCase untuk mencocokan hasil function mul dengan nilai 2 yg seharusnya muncul
	@Test
	public void test3(){
		Assert.assertEquals(c.mul(), 2);
	}

	//TestCase untuk mencocokan hasil function div dengan nilai 2 yg seharusnya muncul
	@Test
	public void test4(){
		Assert.assertEquals(c.div(), 2);
	}
	
	//TestCase setelah testing selesai
	@AfterTest
	public void afterTest() {
		System.out.println("selesai testing menggunakan TestNG..");
	}
}
