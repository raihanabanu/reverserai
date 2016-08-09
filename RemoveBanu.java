# reverserai
import java.util.Scanner;

public class RemoveBanu{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		System.out.println(s1);
		String ret="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			char c1=Character.toUpperCase(c);
			if(!(c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U'))
			{
				ret+=c;
			}
		}
		System.out.println(ret);
	}

}
