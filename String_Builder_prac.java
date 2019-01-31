package String_Packs;

public class String_Builder_prac {

	public static void main(String[] args) {
		
		StringBuilder sBuilder = new StringBuilder("Alamgir");
		sBuilder.append(" "+"Hossain");
		
		System.out.println(sBuilder);
		
		sBuilder.reverse();
		sBuilder.delete(2, 5);
		System.out.println(sBuilder);

	}

}
