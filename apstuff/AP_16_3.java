package apstuff;

//AP_16_3 or CrossSquare ie CrossWord Puzzle;  
public class AP_16_3 {
    int num=0;
    Square[][] square;
    int r,c;
    AP_16_3(int r,int c){
 	    this.r=r;this.c=c;
    	square=new Square[this.r][this.c];
 	      
 	      for(int j=0;j<square.length;j++)
          for(int k=0;k<square[0].length;k++) {
      	    if(Math.random()<0.5) {square[j][k]=new Square(true,-1);}
      		else {this.square[j][k]=new Square(false,0);}
      			}
      }
     
    
    public Square toBeLabeled(int r,int c,Square[][] BlackSqs) {
 	   if(BlackSqs[r][c].isB==true) {return new Square(true,-1);}
 	   //
 	   else {
 		 if(r==0){num++;return new Square(false,num);}
 		 if(r>0&&c==0)  {num++;return new Square(false,num);}   
 		 if(r>0&&BlackSqs[r-1][c].isB==true) {num++;return new Square(false,num);} 
 		 if(r>0&&BlackSqs[r][c-1].isB==true) {num++;return new Square(false,num);} 
 	       
 	   }
 		 return new Square(false,0);
 		 }

     //building puzzle;;
    public Square[][] buildCross(){
 	   
 	   for(int j=0;j<this.r;j++) {
 		   for(int k=0;k<this.c;k++) {
 			   this.square[j][k]=toBeLabeled(j,k,this.square); 
 		   }}return this.square;
 }


  public static void main(String[] args) {
 	 Square sq1=new Square(true,-1);
	  Square.prtSq(sq1);
	  AP_16_3 cword=new AP_16_3(8,8);
	  
	  Square.prtSqs(cword.buildCross());
 	 
 	 }
}
  
  class Square{
	    boolean isB;
	    int num;
	    
	    Square(boolean isB,int num){
		this.isB=isB;
		this.num=num;
	}
 
	    public static void prtSq(Square sq) {
	    	if(sq.isB==true) { System.out.print("( Black Sq )");}
	    	if(sq.isB==false&&sq.num==0){System.out.print("( White Sq )");} 
	    	else{if(sq.num>0)System.out.print("( White Sq "+sq.num+")");}
	    }
	    
	    public static void prtSqs(Square[][] sqs) {
	    	for(int j=0;j<sqs.length;j++) {
     		for(int k=0;k<sqs[0].length;k++) {
	           Square.prtSq(sqs[j][k]);
     		}System.out.println("\n********************");
     		}
}
	     
  }
 

