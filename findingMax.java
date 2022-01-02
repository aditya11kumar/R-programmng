import java.util.*;
public class findingMax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int i=0;
		while(i<n){
			arr[i]= sc.nextInt();
			i++;
		}
		int ans= maxval(arr,0,n-1);
		System.out.println(ans);
	}
	public static int maxval(int arr[],int i, int j){
		if(i==j)
			return arr[i];
		else if(j==i+1){
			if(arr[j]>arr[i])
				return arr[j];
			return arr[i];
		}
		else{
			int mid=i+j/2;
			int maxval1= maxval(arr,i,mid);
			int maxval2= maxval(arr,mid+1,j);
			if(maxval1>maxval2){
				return maxval1; 
			}
			else
				return maxval2;

		}
	}
}