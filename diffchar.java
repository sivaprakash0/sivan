package set2;

public class diffchar {
public static void main(String[] args) {
	char c[]=args[0].toCharArray();
	char c1[]=args[1].toCharArray();
	int cnt=0;
	for(int i=0;i<args[0].length();i++){
		if(c[i]!=c1[i]){
			cnt++;
		}
	}
	if(cnt==1){
	System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
