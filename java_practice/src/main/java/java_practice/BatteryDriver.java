package java_practice;

public class BatteryDriver {
	Battery battery=new Battery("Li-ion",5000);
	Mobile mobile=new Mobile("Samsung",22999.0,8,battery);
	mobile.mobileDetails();
}
