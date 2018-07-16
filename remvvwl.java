public class remvvwl {
public static void main(String[] args) {
	String rev=args[0].replaceAll("[aeiouAEIOU]","");
	System.out.println(new StringBuffer(rev).reverse().toString());	
}
}
