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
		Assert.assertEquals(c.add(1,2), 3);
	}

	//TestCase untuk mencocokan hasil function sub dengan nilai 1 yg seharusnya muncul
	@Test
	public void test2(){
		Assert.assertEquals(c.sub(2,1), 100);
	}

	//TestCase untuk mencocokan hasil function mul dengan nilai 2 yg seharusnya muncul
	@Test
	public void test3(){
		Assert.assertEquals(c.mul(1,2), 2.0);
	}

	//TestCase untuk mencocokan hasil function div dengan nilai 2 yg seharusnya muncul
	@Test
	public void test4(){
		Assert.assertEquals(c.div(4,2), 2.0);
	}
	
	//TestCase untuk mencocokan hasil function mod dengan nilai 0 yg seharusnya muncul
	@Test
	public void test5(){
			Assert.assertEquals(c.mod(8, 2), 0);
	}
	
	//TestCase untuk mencocokan hasil function sqrt dengan nilai 3 yg seharusnya muncul
	@Test
	public void test6(){
			Assert.assertEquals(c.sqrt(9), 3.0);
	}
	
	//TestCase setelah testing selesai
	@AfterTest
	public void afterTest() {
		System.out.println("selesai testing menggunakan TestNG..");
	}
}
