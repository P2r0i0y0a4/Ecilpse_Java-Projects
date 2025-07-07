package isa;

public class Pen extends Stationary {
	private String colour;
	private boolean isRefillable;
	public boolean isRefillable() {
		return isRefillable;
	}
	public void setRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
