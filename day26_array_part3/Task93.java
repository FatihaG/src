package day26_array_part3;

public class Task93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="A Java virtual machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode. ... The JVM reference implementation is developed by the OpenJDK project as open source code and includes a JIT compiler called HotSpot.";
		
		//how many words?
		
		
		String [] arr=str.split(" ");
		
		System.out.println(arr.length);
		
		System.out.println(arr[23]);
	}

}
