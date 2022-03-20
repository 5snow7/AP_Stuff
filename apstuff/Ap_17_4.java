package apstuff;

import java.util.Scanner;

public class Ap_17_4 {
	Scanner scanStr,scanInt;
	int[][] ar;
	int row;int col;
	int[] start1;
	
	Ap_17_4(){
		scanStr=new Scanner(System.in);
		scanInt=new Scanner(System.in);
		
		System.out.println("enter row and col of the array");
	   row=scanInt.nextInt();
	    col=scanInt.nextInt();
	    start1=new int[row*col];
	    ar=new int[row][col];
	    System.out.println("enter "+row*col+" consecutive random integers, separated by commas");
	    String strin=scanStr.nextLine();
	    String[] strAr=strin.split(",");
    	int cnt=0;
    	while(cnt<row*col) {
    		start1[cnt]=Integer.parseInt(strAr[cnt]);
    		cnt++;
    		}
    	int cnt2=0;
    	for(int j=0;j<row;j++) {
    		for(int k=0;k<col;k++) {
    		ar[j][k]=start1[cnt2];cnt2++;
    		}
    	}
	}
	 	
    	public void prtAr(){
    		int cnt3=0;
    		for(int j=0;j<row;j++) {
        		for(int k=0;k<col;k++) {
        			//System.out.print(start1[cnt3]+", ");cnt3++;
        			System.out.print(ar[j][k]+" ");
        		}
        		System.out.println("\n***");
    		}
    	}
    	
    	public static void main(String[] args) {
    		Ap_17_4 ap=	new Ap_17_4();
    		ap.prtAr();
    		System.out.print("wtf");
    	}
    	
    	}


