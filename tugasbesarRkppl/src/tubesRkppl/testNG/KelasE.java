package tubesRkppl.testNG;

import java.awt.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
		List dataList = new List();
		dataList.add("Puput Nurovy");
		dataList.add("Dianda Kacinta");
		dataList.add("Ragam Kakas Pembangunan Perangkat Lunak");
		dataList.add("RPL 2011");
		
		e.setDataList(dataList);
		
		System.out.println("mulai testing menggunakan TestNG..");
	}
	
	//TestCase untuk mencocokan hasil function contains dengan value true yg seharusnya muncul
	@Test
	public void test1(){
		Assert.assertEquals(e.contains("RPLs"), true);
	}
	
	//TestCase untuk menguji hasil true dari function contains
	@Test
	public void test2(){
		Assert.assertTrue(e.contains("RPL"));
	}
	
	//TestCase setelah testing selesai
	@AfterTest
	public void afterTest() {
		System.out.println("selesai testing menggunakan TestNG..");
	}
}
