package apstuff;

public class RecurFunctions {
	 
	
	double x;
	RecurFunctions(){
		x=1;
	}
	
	public double frac1(int n,double x) {
		if(n==0) {return x;}
		else {
			return frac1(n-1,2/(3+x));
		}
	}
	
	public static void main(String arg[]) {
		RecurFunctions f=new RecurFunctions();
		for(int k=0;k<10;k++) {
		for(int j=1;j<8;j++) {
		System.out.print(f.frac1(j+k,3)+", ");
	    }
		System.out.println("\n");
	}
}

}
