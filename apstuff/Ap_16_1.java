package apstuff;


import java.util.ArrayList;
//2016 #1  Random Word Chooser.  Shuffles the List.
public class Ap_16_1{
               
        Ap_16_1(String[] ar){}
      
          public void doAll2(String[] str,int k) {
          	 int len=str.length;
          	 ArrayList<String> strAr=new ArrayList<String>();
          	 for(String s :str) {strAr.add(s);}
      	  while(strAr.size()>0) {
      		  int j=(int)(Math.random()*strAr.size());
      		System.out.print(strAr.get(j)+", ");
      		  strAr.remove(j);
      	  }
      	  int ch=0;
      	while(k-len-ch>=0) {
  	  System.out.print("none, ");ch++;
      	} 	  
           }
          
          public String[] getString(String str) {
        	  int len=str.length();
        	  String[] strNew=new String[len];
        	  for(int j=0;j<len;j++) {
        		  strNew[j]=str.substring(j,j+1);
        	  }
        	  return strNew;
          }
          
          public void prt(String[] str){
        	 for(int j=0;j<str.length-1;j++) {
        		 System.out.print(str[j]+", ");
          }
              System.out.println(str[str.length-1]+"\n list shuffle is: ");
            }
                
        public static void main(String args[]) {
        	String[] test= {"fred","jane","albert","kyle","hilbert"};
        	Ap_16_1 st2=new Ap_16_1(test);
        	st2.prt(test);
        	st2.doAll2(test,7);
        	System.out.println("\n");
        	st2.prt(st2.getString("testing"));
        }
}

