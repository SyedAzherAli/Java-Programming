// polymorphism in java programming 
// defination : polymorphism comes form the greek worlds ply meaning many and morph meaning forms --- it's means many forms 
// two types of polymorphism in java 
// 1. compile-time or static polymorphism 
// 2. runtime or dynamic polymorphism
//
// 1. compile-time polymorphism 
// defination : in java multiple methods can have the same names within aclass if they have different parameter lists(numbers,types, or orderof parameters).
//
public class poly {
	// method wiht two int parameters 	
	public int add(int a, int b) {
		return a + b;
	}
	// methord with three int paratmeters 
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	public static void main(String[] args) 
	{ 	int a = 20; 
		int b = 3;
		int c = 2;
		poly polly = new poly();
		int solution =polly.add(a, b);
		System.out.println(solution);
	}
}
