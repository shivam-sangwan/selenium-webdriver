package selemium_webdriver;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {


		  int number =153,n = number;
	      int r =0,sum=0;
	      while(n>0)
	      {
	        r = n%10;
	        sum = (int)(sum + Math.pow(r, 3));
	        n= n/10;
	      }
	      System.out.println(sum);
	      if(sum==number)
	      {
	       System.out.print("number is armstrong");
	      }
	      else{
	        System.out.print("number is not armstrong");
	      }
	}
}
