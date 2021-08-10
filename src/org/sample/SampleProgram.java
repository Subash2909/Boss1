package org.sample;

public class SampleProgram {
static{
	System.out.println("Static Block");
}
public SampleProgram() {

System.out.println("This is Constructor");

}
public void abc() {
	System.out.println("this is instance method");// TODO Auto-generated method stub

}public void respirotary() {
System.out.println(" respirotary");
}
	public static void main(String[] args) {
	 	SampleProgram program=new SampleProgram();
	program.abc();
		
	}

}
