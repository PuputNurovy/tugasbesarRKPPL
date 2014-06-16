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
		
		// instansiasi di kelas A
		C objekC = new C();
		
		// melakukan pemanggilan berdasarkan fungsi-fungsi yang ada
		System.out.println("Hasil Penambahan : "+objekC.add(1,2));
		System.out.println("Hasil Pengurangan : "+objekC.sub(2,1));
		System.out.println("Hasil Perkalian : "+objekC.mul(2,2));
		System.out.println("Hasil Pembagian : "+objekC.div(2,2));
		System.out.println();
		
		// instansiasi dikelas D
		D objekD = new D();
		
		// melakukan pemanggilan berdasarkan fungsi-fungsi yang ada
		System.out.println("Hasil Pow 2 dan 3 : "+objekD.pow(2, 3));
		System.out.println("Hasil Perkalian 4 dan 2 : "+objekD.mul(4, 2));
		System.out.println("Hasil Pembagian 8 dan 2 : "+objekD.div(8, 2));
		System.out.println();
		
		// membuat list dan meng-add kedalam list
		List dataList = new List();
		dataList.add("Puput Nurovy");
		dataList.add("Dianda Kacinta");
		dataList.add("Ragam Kakas Pembangunan Perangkat Lunak");
		dataList.add("RPL 2011");
		
		// instansiasi dikelas E
		E objekE = new E();
		
		//memasukan list yang barusan dibuat
		objekE.setDataList(dataList);
		
		// mengecek apakah kalimat yang disebutkan terdapat di list yang sudah dibuat
		System.out.println("List Mengandung Kata/Kalimat RPL : "+objekE.contains("RPL"));
		System.out.println();
		
		// menampilkan isi dari list yang ada
		System.out.println("Isi dataList");
		for(int i = 0; i < objekE.getDataList().getItemCount(); i++){
			System.out.println("Index ke "+i+" : "+dataList.getItem(i));
		}
	}
}
