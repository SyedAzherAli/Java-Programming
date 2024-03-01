class Adder{
	static int sum(int a, int b) { return a + b;}
	static int sum(int a, int b, int c) { return a + b + c;}
}
class methodOverloading {
	public static void main(String[] args) {
	Adder add = new Adder();
	System.out.println(add.sum(2,2) + " " + add.sum(2, 2, 2));
	}
}
