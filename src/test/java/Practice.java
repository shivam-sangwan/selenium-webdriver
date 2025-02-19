
public class Practice {

	public static void main(String[] args) {
		
		String s1 = "Shivamsangwan";
		String s = s1.toLowerCase();
		int c=0;
		for(int i=0;s.charAt(i)<s.length();i++) {
			
			if(s.charAt(i)== 'a' || s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u')
			{
				
				c++;
			}
			
		}
		
		

}
}
