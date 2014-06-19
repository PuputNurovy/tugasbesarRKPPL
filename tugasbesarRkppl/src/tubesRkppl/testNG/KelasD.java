package tubesRkppl.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import tubesRkppl.kelas.D;

/**
 * @author 
 * Puput Nurovy
 * 113040155
 */

public class KelasD {
	D d = new D();

	@Test
	public void test1() {
		Assert.assertEquals(d.pow(2, 2), 4.0, "harusnya hasilnya 4");
	}

	@Test
	public void test2() {
		Assert.assertNotSame(d.pow(2, 2), 3, "harusnya hasilnya bukan 4");
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
