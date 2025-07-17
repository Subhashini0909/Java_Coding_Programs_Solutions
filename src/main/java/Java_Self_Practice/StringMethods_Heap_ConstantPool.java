package Java_Self_Practice;

public class StringMethods_Heap_ConstantPool {

	public static void main(String[] args) 
	{
		String a ="abcd";
		String b ="abcd";
		String c ="abc";
		
		String d= new String("abcd"); //All objects are stored in heap memory
		String e= new String("abcd");
		
		System.out.println(a==b); //String Constant pool - Same values
		System.out.println(a==c); //String Constant pool - Diff values 
		System.out.println(a==d); //String Constant pool & Heap memory - Same values
		System.out.println(e==d); //Heap memory - Same values

	}

}
