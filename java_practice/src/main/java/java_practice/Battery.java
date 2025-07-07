package java_practice;

public class Battery {
	String type;
	int batteryCapacity;
	Battery(String type,int batteryCapacity){
		this.type=type;
		this.batteryCapacity=batteryCapacity;
	}
	public void details() {
		System.out.println(type+" "+batteryCapacity);
	}

}
