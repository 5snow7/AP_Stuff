package apstuff;

import java.util.*;

// AP_19_1 Not finished.  ie APCal
//there is a little weirdness for GregorianCalendar is using 1-7 
//have to convert to 0-6.
public class AP_19_1{
	  
      AP_19_1(){}
     
/** Returns the number of leap years between year1 and year2, inclusive.
  * Precondition: 0 <= year1 <= year2
 */
 public static int numberOfLeapYears(int year1, int year2)
 {
   int total=0;
     for(int j=year1;j<=year2;j++){
      if(AP_19_1.isLeapYear(j)){total++;}   
     }                                                                                                                                                                   
     return total;
}

 /** Returns true if year is a leap year and false otherwise. */
 public static boolean isLeapYear(int year)
 {
     return new GregorianCalendar().isLeapYear(year);
 }
 
 public int firstDayOfYear(int year) {
	 Calendar c = Calendar.getInstance();
     c.set(year,0,1);
     int doy = c.get(Calendar.DAY_OF_WEEK)-1;
	 return doy; 
 }
 //this is the one they are suppose to write knowing
 //dayOfYear and firstDayOfYear;
 public int dayOfWeek(int year,int month,int day) {
	 int whittleOne=dayOfYear(year,month,day)+firstDayOfYear(year);
	 whittleOne=whittleOne%7;
	 return whittleOne;
 }
 
 public int dayOfYear(int year,int month,int day)
 {    
	 Calendar c = Calendar.getInstance();
     c.set(year,month,day);
     int doy = c.get(Calendar.DAY_OF_YEAR)-1;
	 return doy;	 
 }

 public static void main(String[] args)
 {  AP_19_1 c=new AP_19_1();
 System.out.println(" day of the year is "+(c.dayOfYear(2022,6,21)+1)
		 +" day of week "+c.dayOfWeek(2022,6,21));
 System.out.println(" first day of year is "+c.firstDayOfYear(2022));
      
 }
}

/*
 public int dayOfWeek(int year,int month,int day) {
	 Calendar c = Calendar.getInstance();
     c.set(year,month,day);
     int doy = c.get(Calendar.DAY_OF_WEEK)-1;
	 return doy; 
 }
 
 
 */


