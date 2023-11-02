package Set;

public class GenericMethod {

	public static <E> void printarray(E[] elements) {
		for(E element : elements) {
			System.out.print(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray = { 'j','a','v','a','T','r','a','i','n','i','n','g'};
		System.out.println("printing integer array");
		printarray( intArray );
		System.out.println("printing character array");
		printarray( charArray );

	}

}
