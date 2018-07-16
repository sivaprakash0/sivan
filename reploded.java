public class reploded {
public static void main(String[] args) {
	char c[]=args[0].toCharArray();
	for(int i=0;i<args[0].length();i=i+2){
		if(i%2==0){
			char c1=c[i];
			c[i]=c[i+1];
			c[i+1]=c1;
		}
		else {
			char c1=c[i];
			c[i]=c[i+1];
			c[i+1]=c1;
		}
		System.out.print(c[i]+""+c[i+1]);
	}
}
}
