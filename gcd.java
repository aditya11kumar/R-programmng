import java.util.Scanner;
public class gcd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		if(val2>val1){
			int temp= val1;
			val1= val2;
			val2=temp;
		}
		int ans = gcd(val1,val2);
		System.out.println(ans);
	}
	public static int gcd(int i, int j){
		if(i==0)
			return j;
		if(j==0)
			return i;
		return gcd(j%i,i);
	}
}