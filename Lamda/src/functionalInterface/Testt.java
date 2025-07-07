package functionalInterface;
import java.util.Arrays;
import java.util.Comparator;

class Testt {
public static void main(String[] args) {
	Integer l[]= {3,8,4,9,7};
	Comparator c=(Object o1,Object o2)->{
		Integer l1=null;
		Integer l2=null;
		if(o1 instanceof Integer && o2 instanceof Integer ) {
			l1=(Integer)o1;
			l2=(Integer)o2;
		}
		if(l1==null||l2==null) return 0;
		return l2-l1;
	};
	Arrays.sort(l,c);
	for(int i=0;i<l.length;i++) {
		System.out.print(l[i]+" ");
	}
}
}

