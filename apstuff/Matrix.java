package apstuff;

import java.util.Scanner;
//still need to write a print the position array....

public class Matrix  {
	Scanner scanStr,scanInt;
	int[][] ar;
	Position pos;
	int[] start1;
	
	Matrix(){
		pos=new Position(0,0);
		scanStr=new Scanner(System.in);
		scanInt=new Scanner(System.in);
		System.out.println("enter row and col of the array");
	    pos.r=scanInt.nextInt();
	    pos.c=scanInt.nextInt();
	    start1=new int[pos.r*pos.c];
	    ar=new int[pos.r][pos.c];
	    System.out.println("enter "+pos.r*pos.c+" consecutive random integers, separated by commas");
	    String strin=scanStr.nextLine();
	    String[] strAr=strin.split(",");
    	int cnt=0;
    	while(cnt<pos.r*pos.c) {
    		start1[cnt]=Integer.parseInt(strAr[cnt]);
    		cnt++;
    		}
    	int cnt2=0;
    	for(int j=0;j<pos.r;j++) {
    		for(int k=0;k<pos.c;k++) {
    		ar[j][k]=start1[cnt2];cnt2++;
    		}
    	}
	}
	 	
    	public void prtAr(){
    		for(int j=0;j<pos.r;j++) {
        		for(int k=0;k<pos.c;k++) {
        		 System.out.print(ar[j][k]+" ");
        		}
        		System.out.println("\n***");
    		}
    	}
    	
    	public void prtAr(int[][] arR){
    		for(int j=0;j<pos.r;j++) {
        		for(int k=0;k<pos.c;k++) {
        		 System.out.print(arR[j][k]+" ");
        		}
        		System.out.println("\n***");
    		}
    	}
    	//gets the position of a value in an array.
    	public Position arrayPosition(int val,int[][] arRay) {
	    	 Position pos=new Position(0,0);
	    	 for(int j=0;j<arRay.length;j++) {
	        		for(int k=0;k<arRay[0].length;k++) {
	        		if(arRay[j][k]==val) {
	        			pos.r=j;pos.c=k;
	        			return pos;
	        		}
    		}}return new Position(-1,-1);
	        		}
    	
    	 public Position[][] arraySuc(int[][] arRay){
    	    	Position[][]  posAr=new Position[arRay.length][arRay[0].length];
    	    	 for(int j=0;j<arRay.length;j++) {
		        		for(int k=0;k<arRay[0].length;k++) {
		        			posAr[j][k]=arrayPosition((arRay[j][k]+1),arRay);
		        		}
    	    	 }	 return posAr;       		
    	    }
    	
    	 //print an array of Positions
    	 public void prtPos(Position[][] posAr) {
    		 for(int j=0;j<posAr.length;j++) {
	        		for(int k=0;k<posAr[0].length;k++) {
	        			
	        			if(posAr[j][k].r==-1)System.out.print(" ("+posAr[j][k].r+", "+posAr[j][k].c+"), "+" null ");
	       	    	 else System.out.print(" ("+posAr[j][k].r+", "+posAr[j][k].c+"), "+this.ar[posAr[j][k].r][posAr[j][k].c]); 	 
	        			//posAr[j][k].prtPos(this);
	        		}System.out.println("\n*******    ******");
    		 }
    	 }
   //Matrix();;; void prtAr();;;void prtAr(int[][] arR);;;
   //Position arrayPosition(int val,int[][] arRay);;;Position[][] arraySuc(int[][] arRay)
   //void prtPos(Position[][] posAr)
   
   //Position();;getPosition(value,int[][]);;prtPos();;prtPos(Matrix)
    	public static void main(String[] args) {
    		  Matrix ap=new Matrix ();
    		ap.prtAr();
    		//Position pos2=new Position(0,0);
    		//Position pos1=pos2.getPosition(5,ap.ar);
    		//System.out.println("("+pos1.r+","+pos1.c+")");
    		//pos1=ap.arrayPosition(3, ap.ar);
    		//System.out.println("("+pos1.r+","+pos1.c+")");
    		ap.prtPos(ap.arraySuc(ap.ar));
    		}
    	}

    class Position{
     int r,c;
     Position(int row,int col){
    	 r=row;c=col;
     }
	
     Position getPosition(int val,int[][] ar) {
    	 Position pos=new Position(0,0);
    	 for(int j=0;j<ar.length;j++) {
        		for(int k=0;k<ar[0].length;k++) {
        		if(ar[j][k]==val) {
        			pos.r=j;pos.c=k;
        			return pos;
        		}
		}}return new Position(-1,-1);
        		}
     
     public void prtPos() {
    	 if(this.r==-1)System.out.print("null");
    	 else System.out.print(" ("+this.r+", "+this.c+"), ");    	 
     }
     
     public void prtPos(Matrix mat) {
    	 for(int j=0;j<mat.ar.length;j++) {
        		for(int k=0;k<mat.ar[0].length;k++) {
        			this.r=k;this.c=j;
    	 if(this.r==-1)System.out.print(" ("+this.r+", "+this.c+")  null ");
    	 else System.out.print(" ("+j+", "+k+"), "+mat.ar[this.r][this.c]);    	 
     }System.out.println("\n***********************");
 }
 }
}
	
