package pack1;

public class j1 {
	int age;
	String name;
	
	j1(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.age+" "+this.name;
	}
	public static void main(String[] args){
		j1 s1 = new j1(21,"Shazi");
		j1 s2 = new j1(23,"Isha");
		
		j1[] s = new j1[2];
		s[0]=s1;
		s[1]=s2;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].age+"   "+s[i].name);
		}
	}
}
