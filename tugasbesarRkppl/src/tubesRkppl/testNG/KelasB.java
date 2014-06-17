package tubesRkppl.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import tubesRkppl.kelas.B;
/**
 * @author 
 * Puput Nurovy
 * 113040155
 */
public class KelasB {
	B b = new B();

	@Test
	public void test1() {
		Assert.assertEquals(b.mul(2, 0), 0.0, "seharusnya hasilnya null");
	}

	@Test
	public void test2() {
		Assert.assertNotSame(b.div(2, 1), 3, "seharusnya hasilnya bukan null");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("mulai testing menggunakan TestNG..");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("selesai testing menggunakan TestNG..");
	}

}
