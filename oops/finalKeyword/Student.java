package oops.finalKeyword;

public final class Student {
	int rollNo;
	String name;
	 public final void getDescription() {
		System.out.println("The student name is "+name);
	}
// FINAL VARIABLES MUST BE INITIALISED
	 //	final int ROLL_NO;
//	final String NAME;
//	final static String CLASS;
//	{
//		ROLL_NO=1;
//	}
//	public Student() {
//		NAME="Aayush";
//	}
//	static {
//		CLASS="12";
//	}
}
