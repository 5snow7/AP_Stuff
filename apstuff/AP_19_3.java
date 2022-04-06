package apstuff;

import java.util.ArrayList;
import java.util.Scanner;
//delimiters

public class AP_19_3 {
	
	String open;
	String close;
	ArrayList<String> enClos;
	Scanner scan;
	String[] str;
	int size;
	
	AP_19_3(String open,String close,int size){
		this.open=open;this.size=size;
		this.close=close;str=new String[this.size];
		enClos=new ArrayList<String>();
	}

	void getString() {
    	System.out.println("enter at most "+this.size+" string elements-each separated by a comma");
        scan=new Scanner(System.in);
    	String inp=scan.nextLine();
    	str=inp.split(",");
        
    }
	
	void getEnclos(String[] str) {
    	 //fill the ArrayList enClos with the delimiters. 
      int j=0;
      while(j<str.length) {
    	  if(this.open.equals(str[j])) enClos.add(str[j]);
    	  if(this.close.equals(str[j])) enClos.add(str[j]);
      j++;
      }
	}
     
     Boolean inOrder() {
          //seeing if the delimiters in the ArrayList are in the
    	   //correct order.
          int cntO=0;int cntC=0;int j=0;
          while(j<enClos.size()) {
        	  if(enClos.get(j).equals(this.open)) {cntO++;}
        	  if(enClos.get(j).equals(this.close)) {cntC++;}
        	  if(cntC>cntO) return false;
        	  j++;
          }
          if(cntO==cntC) {return true;}
          else {return false;}
     } 

    		public static void main(String[] args) {
    			
    			AP_19_3 e1=new AP_19_3("(",")",20);
    			e1.getString();
    			e1.getEnclos(e1.str);
    			System.out.println("the set is "+e1.inOrder());
    			System.out.println(e1.enClos);
    	}
    	}


