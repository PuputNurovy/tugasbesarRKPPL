package tubesRkppl.kelas;

import java.awt.List;

/**
 * @author 
 * Dianda Kacinta
 * 113040249
 */
public class E {

	//Membuat variable dataList
	List dataList = new List();
	
	//Membuat function getDataList untuk mengambil nilai dataList
	public List getDataList() {
		return dataList;
	}

	//Membuat method setDataList untuk setting nilai dataList
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	//Membuat konstruktor class
	public E() {
		// TODO Auto-generated constructor stub
		System.out.println("Ctor di kelas E");
	}
	
	//Membuat function contains untuk memeriksa apakah suatu kata/kalimat memiliki nilai sama dengan value dataList
	public boolean contains(String n){
		int contains = 0;
		for(int i = 0; i < dataList.getItemCount(); i++){
			if(dataList.getItem(i).contains(n)){
				contains += 1;
			}else{
				contains += 0;
			}
		}
		
		if(contains > 0){
			return true;
		}else{
			return false;
		}
	}
	
	//Membuat function toString
	public String toString(){
		return "toString di kelas E";
	}
}
