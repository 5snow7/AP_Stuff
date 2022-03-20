package apstuff;

import java.util.Scanner;//takes in a 1_D array and turns
//that into a 2-D array 

public class Ap_Array {
	int[][] setOf;
	int[] start;
	int total;
	Scanner scanInt=new Scanner(System.in);
	Scanner scanStr=new Scanner(System.in);
	
	Ap_Array(){
		System.out.println("enter size of current Array");
		this.total=scanInt.nextInt();
		setOf=new int[this.total][this.total];
	    start=new int[this.total];

	}
	
    public void ask() {
    	System.out.println("enter "+this.total+" integers separating with a comma");
    	String strIn=scanStr.nextLine();
    	String[] strAr=strIn.split(",");
    	int cnt=0;
    	while(cnt<this.total) {
    		this.start[cnt]=Integer.parseInt(strAr[cnt]);
    		cnt++;
    	}
  }
    
    public int[] get() {
     	this.ask();
    	return this.start;
    	}
 //sort() turns the 1-D array into a 2-D array
    public void into2D() {
        for(int j=0;j<this.total;j++) {
    	
    	for(int k=0;k<this.total;k++) {
    	setOf[j][k]=this.start[k];   
      }}
    }      
     
     public void prt() {
    	for(int j=0;j<this.total;j++) {
    	for(int k=j;k<this.total;k++) {
    		System.out.print("("+setOf[j][j]+","+setOf[j][k]+"), ");	
     }    
    	System.out.println("");
    	System.out.println("*****************");
     }
        }
              
    		public static void main(String args[]) {
    			Ap_Array ar1=new Ap_Array();
    			ar1.ask();
    			ar1.into2D();
    			ar1.prt();
    		}
    
    }
    

