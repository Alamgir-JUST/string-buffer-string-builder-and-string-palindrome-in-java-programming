package String_Packs;

public class Strring_Palindrome {

	public static void main(String[] args) {
		String s1 = "madam";
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer s2 = sb.reverse();
		
		if(s1.equals(s2.toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palibndrome");
		}
		System.out.println(s1+" "+s2);

	}

}
