package apstuff;

public class Indexing {

	public static void main(String[] args) {
		String ex1="cats at dogs is at the atthe hat plat that";
		System.out.println(ex1);
		for(int j=0;j<40;j++) {
			System.out.println(" the indexing starts at "+j+", and the index of 'at' is "+ex1.indexOf("at",j));
		}
	}
	
}
