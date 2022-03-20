package apstuff;

import java.util.ArrayList;
//this is APQuestion 2017 #3
//how this works is by putting the oldS at the end of the string.
public class Ap_17_3 {
	String str;
	Ap_17_3(String str){
		this.str=str;
	}
	
	public int findNth(String oldS,int n) {
		int check=0;int cnt=0;
		while(0<=check&&check<str.length()) {
			
		if((str.indexOf(oldS,check)<str.indexOf(oldS,check+1))&&str.indexOf(oldS,check)>0){
			cnt++;}
		if(cnt==n) {return check;}
	      check++;  
		}return str.indexOf(oldS,check-1);
		}
	
	public void rePlace(String newS,int j,String oldS) {
		int check=findNth(oldS,j);int len=newS.length();
	    System.out.println(str.substring(0,check)+newS+str.substring(check+len));	
		}
	
	public int findLast(String oldS) {
		int cnt=1;int total=str.length();
		while(findNth(oldS,cnt)>0) {
		cnt++;
		}
		System.out.println("last occurence is "+(cnt-1));
		return findNth(oldS,cnt-1);
	}
	
	public static void main(String[] args) {
		Ap_17_3 s=new Ap_17_3("aacats atat ee cats cats cats wwwe at");
            s.rePlace("er",3,"at");
            System.out.println("4 occurence is at "+s.findNth("at",4));
            System.out.println(s.findLast("at"));
            }
    }
