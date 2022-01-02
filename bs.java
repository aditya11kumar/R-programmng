import java.util.Scanner;
public class bs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		 int i=0;
		 for (;i<n ;i++ ) {
		 	arr[i]= sc.nextInt();
		 }
		 int key = sc.nextInt();
		 int index= bsearch(arr,0,n-1,key);
		 System.out.println(index);
	}
	public static int bsearch(int arr[], int i, int j, int key){
		if(i==j){
			if(arr[i]==key)
				return i;
			return -1;
		}
		int mid = (i+j)/2;
		if(arr[mid]==key)
			return mid;
		if(key>arr[mid]){
			return bsearch(arr,mid+1,j,key);
		}
		return bsearch(arr,i,mid-1,key);
	}
}