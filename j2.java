package pack1;

class Father{
	int x=10;
}

class Son extends Father{
	int y=20;
}

public class j2 {
	public static void main(String[] args) {
		Father f=new Son();
		System.out.println(f.x);
//		System.out.println(f.y);
		System.out.println();
	}
}
//package pack1;
//
//class Mother{
//	int x=10;
//}
//class Daughter extends Mother{
//	int y=20;
//}
//
//public class j3 {
//	public static void main(String[] args) {
//		Daughter s=new Daughter();
//		Mother f=s;
//		System.out.println(f.x);
//	}
//}