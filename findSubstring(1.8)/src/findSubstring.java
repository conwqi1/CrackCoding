
public class findSubstring {
	public static boolean isSubstring(String a, String b){
		return a.toLowerCase().contains(b.toLowerCase());
	}
	public static boolean isRotation(String s1,String s2){
		if (s2.length()==s1.length() && s1.length()>0){
			String s1s1=s1+s1;
			//System.out.println(s1s1);
			return isSubstring(s1s1, s2);
			
	          }	
		return false;
		}
	
    public static void main (String[] args){
    	System.out.println(isRotation("abc","bca"));
    }
}
