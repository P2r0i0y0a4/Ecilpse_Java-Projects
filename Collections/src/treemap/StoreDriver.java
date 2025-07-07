package treemap;

import java.util.TreeMap;

public class StoreDriver {
	public static void main(String[] args) {
		TreeMap<Store,Integer> tm=new TreeMap<>();
		tm.put( new Store("Pandian Store","Chennai","Pandian"),1);
		tm.put( new Store("ABC Store","Chennai","XYZ"),4);
		tm.put( new Store("Arisu Store","Chennai","Harry potter"),5);
		tm.put( new Store("Ponnu Store","Avadi","Hari"),2);
		System.out.println(tm);
		
		
	}

}
