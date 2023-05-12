package jj;

public class xor {
	public static void OddCount2(int[] arr, int size) {
		int xorSum = 0;
		int first = 0;
		int second = 0;
		int setBit;
		
		for (int i = 0; i < size; i++)
		xorSum = xorSum ^ arr[i];
		
		setBit = xorSum & ~(xorSum - 1);
		
		for (int i = 0; i < size; i++) {
		if ((arr[i] & setBit) != 0)
		first ^= arr[i];
		else
		second ^= arr[i];
		}
		System.out.println(first);
		System.out.println(second);
		}
	
	public static void triplet(int[] arr,int val) {
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = 0;j<arr.length-2;j++) {
				for(int k = 0;k<arr.length-2;k++) {
					if(arr[i]+arr[j]+arr[k]==val) {
						System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
						break;
					}
			}
			
			}
		}
	}
	public static int majority(int[] arr) {
		int count=0;
		for(int i = 0;i<arr.length;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>arr.length/2) {
					return arr[i];
				}
			}
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {3,4,6,6,4,3,1,3,2,3};
			int size = arr.length;
			OddCount2(arr,size);
			triplet(arr,16);
			int arr1[]= {1,2,3,4,4,4,4,4,3,4,2,4,1,4,2,4,3,4};
			System.out.println(majority(arr1));
		
	}

}
