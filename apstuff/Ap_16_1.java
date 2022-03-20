package apstuff;


import java.util.ArrayList;
//2016 #1
public class Ap_16_1{
        ArrayList<String> list;
               
        Ap_16_1(String[] ar){
        	list=new ArrayList<String>();
            for(String s:ar) {list.add(s);}
            
        }
        
        public void prt() {
          for(int j=0;j<list.size();j++) {
        	  System.out.print(list.get(j)+", ");
          }
          System.out.println("\n list shuffle is: ");
        }
        
          public void doAll(int k) {
            	ArrayList<String> list2=new ArrayList<String>(); 
            	int total=list.size();
        	  while(list.size()>0) {
        		  list2.add(list.remove((int)(Math.random()*list.size())));
        	  }
        	 int ch=0;
        	  while(k-total-ch>=0) {list2.add("none");ch++;}
        	  for(int j=0;j<k;j++) {
        		  System.out.print(list2.get(j)+", ");
        	  }
             }
      //this is the best version actually doesn't work.  
          public void doAll2(int k) {
          	 int total=list.size();
      	  while(list.size()>0) {
      		  int j=(int)Math.random()*list.size();
      		System.out.print(list.get(j)+", ");
      		  list.remove(j);
      	  }
      	  int ch=0;
      	while(k-total-ch>=0) {
  	  System.out.print("none, ");ch++;
      	} 	  
           }
                
        public static void main(String args[]) {
        	String[] test= {"fred","jane","albert","kyle","hilbert"};
        	Ap_16_1 st2=new Ap_16_1(test);
        	st2.prt();
        	st2.doAll(7);
        }
}

