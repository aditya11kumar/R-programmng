import java.util.Scanner;
public class fib{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int ans=fib(val);
		System.out.println(ans);
	}
	public static int fib(int value){
		if(value<=1){
			return value;
		}
		else{
			return fib(value-2)+fib(value-1);
		}
	}
}