import java.util.*;
public class gratern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int i=0;
		for (;i<n ;i++ ) {
			arr[i]= sc.nextInt();
		}
		int val= sc.nextInt();
		Arrays.sort(arr);
		if(arr[n-1]+arr[n-2]>val)
			System.out.println("The two values are "+arr[n-2]+" and "+arr[n-1]);
		else
			System.out.println("There are no such number exists");

	}
}