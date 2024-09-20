public class PermutationString {
	public static void permute(String que,String ans) {
		if(que.length()==0) {
			System.out.println(ans);
		}
		for(int i=0;i<que.length();i++) {
			char ch=que.charAt(i);
			String left=que.substring(0,i);
			String right=que.substring(i+1);
			String root=left+right;
			permute(root,ans+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("abcd","");

	}

}
