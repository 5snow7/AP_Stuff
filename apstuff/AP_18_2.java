package apstuff;

import java.util.ArrayList;
// This is AP_18_2 or here first class is WordPair
public class AP_18_2 {
	  String first,sec;
	  
	AP_18_2(String first,String sec){
		this.first=first;this.sec=sec;
	}
	
	public String getFirst() {return first;}
	public String getSec() {return sec;}

    public static void main(String[] args) {
	     String[] testList= {"are","they","here","are","help"};
	     WordPairList wpl=new WordPairList(testList);
	     wpl.prtList();
	     wpl.numMatches();
	     }
	}

        class WordPairList {
        
        	   ArrayList<AP_18_2> wordList;
        	   
        	   WordPairList(String[] words){
        		   wordList=new ArrayList<AP_18_2>();
        		   for(int j=0;j<words.length-1;j++) {
        			   for(int k=j+1;k<words.length;k++) {
                      wordList.add(new AP_18_2(words[j],words[k]));        		        		   
        			   }}}
         
        	   void prtList() {
        		   int cnter=1;
        		   for(int j=0;j<wordList.size();j++) {
        			   if(cnter%5==0) {System.out.println("");}
        		       cnter++;
        			   System.out.print("{"+wordList.get(j).getFirst()+", "+wordList.get(j).getSec()+" }, " );   
        		       }
        		   }
        	   
        	   void numMatches() {
        		   int cntmatches=0;
        		   for(int j=0;j<wordList.size();j++) {
        			  if(wordList.get(j).getFirst().equals(wordList.get(j).getSec())) {cntmatches++;}                   
        		   
        	   }System.out.println("\n number of matches are "+cntmatches);
        		   }
        }
        	   
        
        
	
        

