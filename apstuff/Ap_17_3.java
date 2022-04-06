package apstuff;

import java.util.ArrayList;
//this is APQuestion 2017 #3  finding Nth substring in a string

public class Ap_17_3 {
	String str;
	Ap_17_3(String str){
		this.str=str;
	}
	
	public int findNth(String oldS,int n) {
		int check=0;int cnt=0;
		while(0<=check&&check<=str.length()) {
			
		if((str.indexOf(oldS,check)<str.indexOf(oldS,check+1))){//&&str.indexOf(oldS,check)>0){
			cnt++;}
		if(cnt==n) {return str.indexOf(oldS,check);}
	      check++;  
		}return str.indexOf(oldS,check-1);
		}
	
	public void rePlace(String newS,int j,String oldS) {
		int check=findNth(oldS,j);int len=newS.length();
	    System.out.println(str.substring(0,check)+newS+str.substring(check+len));	
		}
	
	public int findLast(String oldS) {
		int cnt=1;
		while(findNth(oldS,cnt)>0) {
		cnt++;
		}
		return findNth(oldS,cnt-1);}
	
	public int findLastRedo(String oldS) {
		int cnt=1;
		String strBu=str;
		str=str+oldS;
		while(findNth(oldS,cnt)>0) {
		cnt++;
		}
		str=strBu;
		return findNth(oldS,cnt-1);}
	
	public static void main(String[] args) {
		String ex1="aacats atat ee cats cats cats atwwwe aata at vat";
		Ap_17_3 s=new Ap_17_3(ex1);
            s.rePlace("er",3,"at");
		    System.out.println(ex1);
            System.out.println("nth occurence of 'at' is at "+s.findNth("at",5));
            System.out.println(s.findLastRedo("at"));
            System.out.println(ex1.indexOf("at",44)+" length is "+ex1.length());
            System.out.println(ex1.indexOf(1));
            }
    }
