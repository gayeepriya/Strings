
	import java.util.ArrayList;
	import java.util.Scanner;
	public class Sample {
		public static void main(String[] args) {
			ArrayList al1=new ArrayList();
			al1.add("priya");
			al1.add(20);
			al1.add("true");
			al1.add("sushu");
			System.out.println(al1);
			ArrayList al2=new ArrayList();
			al2.add("priya");
			al2.add(49);
			System.out.println(al2);
			ArrayList al3=new ArrayList();
			al3.add(al2);//add a complete arraylist
			al3.add(55);//added to rear
			al3.add(0,7);//added to first
			al3.add(2,9);//added to 2nd index
			System.out.println(al3);
		}

	}

	