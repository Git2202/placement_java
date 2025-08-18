package pack1;

class Person{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String gteName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class j5 {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.getAge());
		System.out.println(p.gteName());
		p.setAge(21);
		p.setName("Isra");
		System.out.println(p.getAge());
		System.out.println(p.gteName());
	}
}
