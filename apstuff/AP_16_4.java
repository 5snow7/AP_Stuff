package apstuff;

import java.util.ArrayList;
import java.util.Scanner;
//AP_16_4  or SpacingWords
public class AP_16_4 {
	
	ArrayList<String> strs;
	int total=0;//number of words
	int strsLength=0;//is the total length of the strings
	int div=0;int rem=0;
	int totalchar;//total length of final string with the spaces. 
	
	AP_16_4(int totalchar){
		this.totalchar=totalchar;
		strs=new ArrayList<String>();
	Scanner scanStr=new Scanner(System.in);  
	Scanner scanint=new Scanner(System.in); 
	System.out.println("enter number of words you are entering");
	total=scanint.nextInt();
	System.out.println("Enter "+total+ " words.");
	for(int j=0;j<total;j++) {
		String nextStr=scanStr.nextLine();
		strsLength+=nextStr.length();
		strs.add(nextStr);
	}
	
	div=(totalchar-strsLength)/(total-1);rem=((totalchar-strsLength)%(total-1));
	System.out.print("div is "+div+" rem is "+rem+" total word length is "+strsLength+"\n");
	}
	
	public void prtList() {
		for(String s:strs) {
			System.out.print(s+"  ");
		}
		}
  
	 public void prtWords(){
		 String testNull=".............";
		 String combine="";
		 int remAdd=rem;
		for(int j=0;j<total-1;j++) {
		   combine+=strs.get(j)+testNull.substring(0,div);
		   if(remAdd>0) {combine+=testNull.substring(0,1);remAdd--;}
		}
		combine+=strs.get(total-1);
		System.out.println(combine);
		 System.out.println("total length is "+combine.length());
		 }
		
    public static void main(String[] args) {
    AP_16_4 test1=new AP_16_4(40);
	test1.prtWords();
	}
}

