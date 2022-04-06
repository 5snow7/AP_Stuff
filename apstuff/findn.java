package apstuff;
//Jacob's version of AP_17_3  FindNthExpression
public class findn {
	public String phrase;
	findn(String n){
		phrase=n;
	}
	
	public  int findNth(String str,int n) {
		String result=phrase;
		int count=0;
		int temp=-1;
		int perma=0;
		while(count<n) {
			if(result.indexOf(str)!=-1) {temp=result.indexOf(str);
			}
			else return -1;
			
			result=result.substring(temp+str.length());
			count++;
		}
		perma=phrase.length()-result.length()+temp;
		return perma;
	}
	
	public void replaceNth(String str,int n,String with) {
		int perma=this.findNth(str, n);
		String idea=phrase.substring(0,perma);
		String idea2=phrase.substring(perma+str.length());
		phrase=idea+with+idea2;
		}
	
	public int findlast(String str) {
		int temp=-1;
		int count=0;
		while(this.findNth(str, count)!=-1){
		temp=this.findNth(str, count);
		count++;
		}
		return temp;
		}
	
	
	public static void main(String[] args) {
		String str="the help is on the way is it the";
		findn test=new findn(str);
		System.out.println("Nth the is at "+test.findNth("the", 2));
		//test.replaceNth("the",2,"a");
		System.out.println(test.phrase);
		System.out.println(test.findlast("the"));
		System.out.println(str.length());
		
	}
}
