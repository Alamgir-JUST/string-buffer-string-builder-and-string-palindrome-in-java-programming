package String_Packs;

public class String_Buffer_prac {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Alamgir Hossain");
		//add new value
		sb.append(" "+"CSE, JUST");
		
		System.out.println(sb);
		//Reverse whole string
		
		sb.reverse();
		System.out.println("After reverse : "+sb);
		sb.reverse();
		
		//delete from one index to another index
		
		sb.delete(2, 4);
		System.out.println(sb );
		
		
		
	}

}
