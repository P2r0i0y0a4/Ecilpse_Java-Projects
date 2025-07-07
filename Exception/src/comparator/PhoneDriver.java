package comparator;

import java.util.Arrays;
import java.util.Comparator;
public class PhoneDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] ph= {
				new Phone("Samsung", 10000, 4, 18, "Intel"),
				new Phone("Redmi", 15000, 8, 22, "Intel"),
				new Phone("OnePlus", 12000, 4, 19, "A"),
		};
		brandComparator e1=new brandComparator();
		Arrays.sort(ph,e1);
		for(int i=0;i<ph.length;i++) {
			System.out.println(ph[i]);
		}
		System.out.println("================================================");
		priceComparator e2=new priceComparator();
		Arrays.sort(ph,e2);
		for(int i=0;i<ph.length;i++) {
			System.out.println(ph[i]);
		}
		System.out.println("================================================");
		ramComparator e3=new ramComparator();
		Arrays.sort(ph,e3);
		for(int i=0;i<ph.length;i++) {
			System.out.println(ph[i]);
		}
		System.out.println("================================================");
		cameraComparator e4=new cameraComparator();
		Arrays.sort(ph,e4);
		for(int i=0;i<ph.length;i++) {
			System.out.println(ph[i]);
		}
		System.out.println("================================================");
		processorComparator e5=new processorComparator();
		Arrays.sort(ph,e5);
		for(int i=0;i<ph.length;i++) {
			System.out.println(ph[i]);
		}
	}
	
}
class brandComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Phone e1=null,e2=null;
		if(o1 instanceof Phone && o2 instanceof Phone) {
			e1=(Phone)o1;
			e2=(Phone)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getBrand().compareTo(e2.getBrand());
	}
}
class priceComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Phone e1=null,e2=null;
		if(o1 instanceof Phone && o2 instanceof Phone) {
			e1=(Phone)o1;
			e2=(Phone)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getPrice()-e2.getPrice();
	}
}
class ramComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Phone e1=null,e2=null;
		if(o1 instanceof Phone && o2 instanceof Phone) {
			e1=(Phone)o1;
			e2=(Phone)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getRam()-e2.getRam();
	}
}
class cameraComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Phone e1=null,e2=null;
		if(o1 instanceof Phone && o2 instanceof Phone) {
			e1=(Phone)o1;
			e2=(Phone)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getCamera()-e2.getCamera();
	}
}
class processorComparator implements Comparator{			
	@Override
	public int compare(Object o1, Object o2) {
		Phone e1=null,e2=null;
		if(o1 instanceof Phone && o2 instanceof Phone) {
			e1=(Phone)o1;
			e2=(Phone)o2;
		}
		if(e1==null || e2==null) return 0;
		return e1.getProcessor().compareTo(e2.getProcessor());
	}
}
