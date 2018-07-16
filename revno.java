package set2;

public class revno {
public static void main(String[] args) {
	int no=Integer.parseInt(args[0]);
	String rev=new StringBuffer(Integer.toString(no)).reverse().toString();
	System.out.println(rev);
}
}
