package pack1;

public class Laptop {
	int cost;
	String company;
	int ramSize;
	
	Laptop(int cost,String company,int ramSize){
		this.cost=cost;
		this.company=company;
		this.ramSize=ramSize;
	}
	
	@Override
	public String toString() {
		return this.cost+" "+this.company+" "+this.ramSize;
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop(5558,"abc",324);
		Laptop l2=new Laptop(3097,"dfg",455);
		Laptop l3=new Laptop(4533,"rte",543);
		Laptop l4=new Laptop(2456,"srt",765);
		Laptop l5=new Laptop(6443,"jkl",543);
		
		Laptop[] l = {l1,l2,l3,l4,l5};
		
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		
		}
	}
}
