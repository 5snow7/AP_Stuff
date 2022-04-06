package apstuff;

import java.util.ArrayList;
//this is AP_18_4 or ArrayTester--ie the Latin Square...
public class AP_18_4 {
         int[][] intArray;
         
         AP_18_4(int[][] intArray){
        	 this.intArray=new int[intArray.length][intArray[0].length];
        	 for(int j=0;j<intArray.length;j++) {
        		 for(int k=0;k<intArray[0].length;k++) {
        			 this.intArray[j][k]=intArray[j][k];
        		 }
        	 }}
        	 
        	 public static int[] getColumn(int[][] arr2d, int c){
        		 int[] col=new int[arr2d[0].length];
        		 for(int j=0;j<arr2d[0].length;j++) {
        			 col[j]=arr2d[j][c];
        		 }return col;}
        	 
        	 public static boolean containsDuplicates(int[] arr) {
        		 for(int j=0;j<arr.length;j++) {
        			 for(int k=0;k<arr.length;k++) {
        				 if((j!=k)&&(arr[j]==arr[k])) {return true;}
        	 }}return false;
        	 }
        	 
        	 public static boolean hasAllValues(int[] arr1,int[] arr2) {
        		int cnt=0;
        		//if(ArrayTester.containsDuplicates(arr1)||ArrayTester.containsDuplicates(arr2)) {return false;}
        		if((arr1.length>arr2.length)||(arr2.length>arr1.length)) {return false;}//pre-condition that same length
        		 for(int j=0;j<arr1.length;j++) {
        			 for(int k=0;k<arr2.length;k++) {
        				 if(arr1[j]==arr2[k]) { cnt++; }
        			 }
        		 }
        		 if(cnt==arr1.length) {return true;}
        		 else {return false;}
        	 }
        	 // note in isLatin, because of how hasAllValues is "unidirectional", you must put
             //square[0] second.  
        	 public static boolean isLatin(int[][] square) {
        		 
        		 for(int j=1;j<square.length;j++) {
        			 if(containsDuplicates(square[j])) {return false;}
        			 if(hasAllValues(square[0],square[j])) {}
        			 else {return false;}
        				 }
        		 for(int j=0;j<square.length;j++) {
        			 if(containsDuplicates(getColumn(square,j))) {return false;}
        			 if(hasAllValues(square[0],getColumn(square,j))) {}
        			 else {return false;}
        			 }
        		 return true;
        	 }
        	 
        	public static void main(String[] args) {
        		 int[] test1={3,4,4,5};int[] test2={3,2,5,4};
        		 int[][] sq= {{3,2,4,5},{5,2,3,4},{4,5,2,3},{3,4,5,2}};
        		// ArrayTester at=new ArrayTester(sq);
        	
        		 System.out.println(AP_18_4.hasAllValues(test2, test1));
        		 System.out.println(AP_18_4.containsDuplicates(test1));  
        		 System.out.println(AP_18_4.isLatin(sq));
        	 }
          
        	 

}

