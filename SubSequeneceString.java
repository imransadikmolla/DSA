

public class SubSequeneceString {
	public static void helper(String str,String ans,int index) {
		if(str.length()==index) {
			System.out.println("ans: "+ans);
			return;
		}
		
		helper(str,ans+str.charAt(index),index+1);
		helper(str,ans,index+1);
		
		return;
		
	}
	public static void main(String[] args) {
		
		helper("abc","",0);
	}
	

}
