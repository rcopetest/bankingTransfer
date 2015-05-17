package com.eintern.corejava.objects;

public class CloneExample {
	private int a;
	private Integer[] b;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public CloneExample(int a, Integer[] b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Integer[] getB() {
		return b;
	}
	public void setB(Integer[] b) {
		this.b = b;
	}
	
	
}
