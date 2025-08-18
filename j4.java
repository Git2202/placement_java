package pack1;

class Student{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}

public class j4 {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getAge());
		s.setAge(20);
		System.out.println(s.getAge());
	}
}
