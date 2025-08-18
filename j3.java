package pack1;

class Mother{
	int age=40;
}
class Daughter extends Mother{
	String name="uma";
}

public class j3 {
	public static void main(String[] args) {
		Mother m=new Daughter();
		System.out.println(m.age);
		
		
		Daughter d= (Daughter)m;
		System.out.println(d.age+" "+d.name);
	}
}
