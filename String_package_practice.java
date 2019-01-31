package String_Packs;

public class String_package_practice {
	public static void main(String[] args) {
		
		String s1 = "Alamgir Hossain";
		String s2 = new String("alamgir hossain");
		
		//Length Print
		
		System.out.println(s1.length()+" "+s2.length());
		
		//when s1==s2 then object check
		//When s1.equals(s2) then value check
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equal");
		}
		//Ignore case
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
		
		//String is exist or not
		
		boolean ck = s1.contains("Alamgir");
		System.out.println(ck);
		
		//Empty or not
		
		boolean ck2 = s1.isEmpty();
		System.out.println(ck2);
		
		//to uppercase
		
		String ns1 = s1.toUpperCase();
		System.out.println(ns1);
		//to lowercase
		String ns2 = s1.toLowerCase();
		System.out.println(ns2);
		
		String add = s1+" "+s2;
		
		System.out.println("After Adding : "+add);
		
		//concatenation
		
		String ns3 = s1.concat(s2);
		System.out.println(ns3);
		
		//starts with
		
		if(s1.startsWith("A")) {
			System.out.println("Starts with A");
		}else {
			System.out.println("Not starts with A");
		}
		if(s1.endsWith("n")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		//Character at the index number
		
		char ch = s1.charAt(5);
		System.out.println("Character at 5 index is : "+ch);
		
		//charaters index number check
		
		int aascii_value = s1.codePointAt(5);
		System.out.println("Ascii value of "+s1.charAt(5)+" "+aascii_value);
		
		//Position of index
		
		int pos = s1.indexOf("n");
		int last_index = s1.lastIndexOf("n");
		
		//remove strings space from head and tail
		
		
		String ns4 = s1.trim();
		
		System.out.println(ns4);
		
		//replace one character by anmother
		
		String ns5 = s1.replace('a', 'b');
		System.out.println(ns5);
		
		//Split method
		
		//divide a string in different string
		
		String[] ns6 = s1.split(" ");
		
		for(String x : ns6) {
			System.out.println(x);
		}
	}
}
