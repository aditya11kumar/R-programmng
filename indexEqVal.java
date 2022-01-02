// i/p: A sorted array of n- distinct integers
// o/p: element equals index
int search(int arr[],i,j){
	if(i==j){
		if(arr[i]==i)
			return i;
		return -1;
	}
	int mid = (i+j)/2;
	if (arr[mid]== mid) {
		return mid;
	}
	if(arr[mid]>mid)
		return search(arr, i , mid-1);
	return search(arr,mid+1,j);

}