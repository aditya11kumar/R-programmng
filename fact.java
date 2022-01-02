import java.util.Scanner;
public class fact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val= sc.nextInt();
		int ans = factorial(val);

		System.out.println(ans);
	}
	public static int factorial(int val){
		if(val<=1){
			return 1;
		}
		else{
			return val*factorial(val-1);
		}
	}
}