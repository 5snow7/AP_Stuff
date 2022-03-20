package apstuff;

import java.util.ArrayList;

public class StudentList {
        ArrayList<String> list;
        String[] str;
        
        StudentList(String[] ar){
        	list=new ArrayList<String>();
            str=ar;
            for(String s:str) {list.add(s);}
                    }
        
        public void prt() {
          for(int j=0;j<str.length;j++) {
        	  System.out.print(list.get(j)+", ");
          }
        }
        
          public void doAll(int k) {
            	ArrayList<String> list2=new ArrayList<String>(); 
            	int total=list.size();
        	  while(list.size()>0) {
        		  list2.add(list.remove((int)(Math.random()*list.size())));
        	  }
        	 int ch=0;
        	  while(k-total-ch>=0) {list2.add("none");ch++;}
        	  
        	  System.out.println("\n**table 1");
        	  for(int j=0;j<3;j++) {
        		  System.out.print(list2.get(j)+"  ");
        	  }
        	  System.out.println("\n**table 2");
        	  for(int j=3;j<6;j++) {
        		  System.out.print(list2.get(j)+" ");
        	  }
        	  System.out.println("\n**table 3");
        	  for(int j=6;j<9;j++) {
        		  System.out.print(list2.get(j)+" ");
        	  }
        	  System.out.println("\n**table 4");
        	  for(int j=9;j<11;j++) {
        		  System.out.print(list2.get(j)+" ");
        	  }
        	  System.out.println("\n**table 5");
        	  for(int j=11;j<13;j++) {
        		  System.out.print(list2.get(j)+"  ");
        	  }
        	  System.out.println("\n**table 6");
        	  for(int j=13;j<15;j++) {
        		  System.out.print(list2.get(j)+"  ");
        	  }
        	  System.out.println("\n**table 7");
        	  for(int j=15;j<18;j++) {
        		  System.out.print(list2.get(j)+"  ");
        	  }
        	  System.out.println("\n**table 8");
        	  for(int j=18;j<20;j++) {
        		  System.out.print(list2.get(j)+"  ");
        	  }
        	  
          }
                
        public static void main(String args[]) {
        	String[] test= {"Sage","Brandon","Chris","Konnor","Bryan","Kaley","Gavin","Jon","Kate","Lily","Emily","Clara","Robert",
        			"Rocky","Kayla","Rebecca","Dylan","Kristi","Cassandra","Rhiannon"};
        			
        	StudentList st2=new StudentList(test);
        	st2.doAll(20);
        }
}
