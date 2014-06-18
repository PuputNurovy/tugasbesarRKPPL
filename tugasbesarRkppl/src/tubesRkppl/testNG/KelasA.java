package tubesRkppl.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import tubesRkppl.kelas.A;
/**
 * @author 
 * Puput Nurovy
 * 113040155
 */
public class KelasA {
	A a = new A();

	@Test
	public void test1() {
		Assert.assertNotSame(a.add(1, 1), 3, "seharusnya hasilnya bukan 3");
	}

	@Test
	public void test2() {
		Assert.assertSame(a.add(1, 1), 2, "seharusnya hasilnya 2");
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
