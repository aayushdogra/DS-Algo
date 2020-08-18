package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class StaticClass {

	public static void main(String[] args) {
		
		A objA=new A();
		B objB=objA.new B();
		C objC=new A.C();
		
	}

}
