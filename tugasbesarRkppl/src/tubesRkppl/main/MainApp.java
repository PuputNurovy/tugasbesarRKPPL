package tubesRkppl.main;

import java.awt.List;

import tubesRkppl.kelas.C;
import tubesRkppl.kelas.D;
import tubesRkppl.kelas.E;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class MainApp {

	//Membuat method main yang akan menjalankan keseluruhan program
	public static void main(String[] arr) {
		C objekC = new C();
		System.out.println("Hasil Penambahan : "+objekC.add());
		System.out.println("Hasil Pengurangan : "+objekC.sub());
		System.out.println("Hasil Perkalian : "+objekC.mul());
		System.out.println("Hasil Pembagian : "+objekC.div());
		System.out.println();
		
		D objekD = new D();
		System.out.println("Hasil Pow 2 dan 3 : "+objekD.pow(2, 3));
		System.out.println("Hasil Perkalian 4 dan 2 : "+objekD.mul(4, 2));
		System.out.println("Hasil Pembagian 8 dan 2 : "+objekD.div(8, 2));
		System.out.println();
		
		List dataList = new List();
		dataList.add("Puput Nurovy");
		dataList.add("Dianda Kacinta");
		dataList.add("Ragam Kakas Pembangunan Perangkat Lunak");
		dataList.add("RPL 2011");
		
		E objekE = new E();
		objekE.setDataList(dataList);
		System.out.println("List Mengandung Kata/Kalimat RPL : "+objekE.contains("RPL"));
		System.out.println();
		System.out.println("Isi dataList");
		for(int i = 0; i < objekE.getDataList().getItemCount(); i++){
			System.out.println("Index ke "+i+" : "+dataList.getItem(i));
		}
	}
}
