package jj;

import java.util.*;

public class SORT {
	
	public static void reduction(int arr[]) {
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					arr[j]=arr[j]-arr[i];
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void compare(int arr[],int arr2[]) {
		
		
		
		int aux[]= Arrays.copyOf(arr, arr.length);
		int aux2[]= new int[arr.length];
		
		
		Arrays.sort(arr);
		Arrays.sort(arr2);       
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				
				if(arr[i]==aux[j]) {
					aux2[j]=arr2[i];
					
				}
			}
		}
		
		for(int h =0;h<aux2.length;h++) {
			System.out.print(aux2[h]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {6,1,5,2,4,3};
		int arr2[]= {3,1,9,5,7,6};
		reduction(arr);
		compare(arr1,arr2);
		
		
		
	}

}
