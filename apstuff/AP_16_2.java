package apstuff;
//AP_16_2
public class AP_16_2 {
	String machineId;
	String desc;
	int len;
	int ch;
	 
	AP_16_2(String message){
		int colon=message.indexOf(":");
		machineId=message.substring(0,colon);
		desc=message.substring(colon+1);
	}
	
	boolean containsWord(String keyword) {
		this.ch=desc.indexOf(keyword);
		 this.len=keyword.length();
		
		if(ch==0) {return true;}//&&
		 if(desc.substring(ch-1,ch).equals(" ")) {return true;}
		if(desc.substring(ch+len,ch+len+1).equals(" ")) {return true;}
		if(desc.length()-len==ch) {return true;}
		return false;
		}
    
	public String getMachineId() {return machineId;}
	public String getDesc() {return desc;}
	
	public static void main(String args[]) {
		AP_16_2 logm=new AP_16_2("Server3:aaDisk Not FoundDisk");
		System.out.println(logm.getMachineId()+"  "+logm.getDesc());
		System.out.println("checking keyword "+logm.containsWord("Disk")+" length of "+logm.len);
		System.out.println(" checking substring "+logm.desc.substring(logm.ch+logm.len,logm.ch+logm.len+1));
	}

}
