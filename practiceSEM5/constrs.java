class person {
	String name;
	int age;
	public person() {
		name = "syed azher ali";
		age = 21;
	} 
}
public class constrs {
	public static void main(String[] args) {
		person syed = new person();
		System.out.println(syed.name + " " + syed.age);
	}
}
