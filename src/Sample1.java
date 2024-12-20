

	import java.util.ArrayList;
	import java.util.Scanner;
	public class Sample1 {
		public static void main(String[] args) {
			ArrayList al1=new ArrayList();
			al1.add("hello");
			al1.add(20);
			al1.add("true");
			al1.add("sushu");
			for(Object obj:al1) {//applicable only for classes that allow index based accessing
			System.out.println(obj);
		}

	}

	
}
