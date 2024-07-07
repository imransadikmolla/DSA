/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class StringPermutation
{
    public static void permute(char input[]){
        Map<Character,Integer> countMap=new TreeMap<>();
        for(char ch:input){
            countMap.compute(ch,(key,val)->{
                if(val==null)
                return 1;
                else
                return val+1;
            });
        }
        System.out.println(countMap);
        char str[]=new char[countMap.size()];
        int count[]=new int[countMap.size()];
        int index=0;
        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            str[index]=entry.getKey();
            count[index]=entry.getValue();
            index++;
            
        }
        char result[]=new char[input.length];
        permuteUtil(str,count,result,0);
    
        
    }
     public static void permuteUtil(char str[], int count [],char result[],int level){
         if(level==result.length){
             printArray(result);
             return;
         }
         for(int i=0;i<str.length;i++){
             if(count[i]==0)
             continue;
             result[level]=str[i];
             count[i]--;
             permuteUtil(str,count,result,level+1);
             count[i]++;
         }
     }
     	public static void printArray(char [] input) {
		  for(char ch : input) {
		      System.out.print(ch);
		  }
		   System.out.println();
	}
	public static void main(String[] args) {
	    char[] charArray = {'b', 'c','a'};
		permute(charArray);
	}
}