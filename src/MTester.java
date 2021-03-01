
public class MTester {

	public static int count =0;

	public static void main(String[] args) {
		/*String text = "Learning Java is fun.";
		String result = text.substring(1, 4);
		System.out.println(result);
		
		String text = "I am interested in Java!";
		int result = text.indexOf("i");
		System.out.println(result);
		
		ClassA object1 = new ClassA("hello");
		ClassA object2 = new ClassA("hello");
		System.out.println(object1==object2);
		
		ClassA object1 = new ClassA("hello");
		ClassA object2 = new ClassA("hello");
		System.out.println(object1.equals(object2));
		
		ClassA object1 = new ClassA("hello");
		ClassA object2 = object1;
		System.out.println(object1==object2);
		
		ClassA object1 = new ClassA("hello");
		ClassA object2 = object1;
		System.out.println(object1.equals(object2));*/
	
		String[] list = {"hello","there","","bye","seeya","later"};
		
		countStringsLongerThan(list,3);
		
		System.out.println(count);
		countStringsLongerThan(list);
		System.out.println(count);
	
	}//end main
	
	public static int countStringsLongerThan(String[] list,int num ) {
		
		for (int i=0; i<list.length; i++) {
			if (list[i].length()>num) {
				count++;
			}
		}
		return count;
		
	}
	//method overload
	public static int countStringsLongerThan(String[] list ) {
		countStringsLongerThan(list,0);
		return count;
		}
	
	
	

}
