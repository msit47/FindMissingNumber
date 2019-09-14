
public class FindMissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1, 2, 4,6, 3, 7, 8};
		int len=arr.length;
		int sum=(len+1)*(len+2)/2;
		int count=0;
		for(int i=0;i<len;i++){
			sum=sum-arr[i];
		}
		System.out.println("missing number "+(sum-count));
		

}
}