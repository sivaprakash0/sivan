package set2;

import java.util.Scanner;
public class camelca {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s[]=in.nextLine().split(" ");
    for(String a:s){
    	System.out.print(a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+" ");
    }
}
}
