package com.unit2.binary_search;
/**
 * 二分法查找
 * @author taojiajun
 *
 */
public class BinarySearch {
	/**
	 * A查找数组
	 * a目的数字
	 * @param A
	 * @param a
	 * @return
	 */
	public static int binarySearch(int A[],int a){
		int left=0;
		int rigth=A.length-1;		
		while(left<=rigth){
			int mid=(left+rigth)/2;
			if(a==A[mid]){
				return mid;
			}else if(a<A[mid]){
				rigth=mid-1;
			}else{
				left=mid+1;
			}
		}
		
		return -1;
	}
	/**
	 * 二分法递归查找  思想就是 把查找可以分成子问题查找 所以要
	 * 对数组进行 分开查找 要记录查找的 下标
	 * @param A
	 * @param left
	 * @param right
	 * @param a
	 * @return
	 */

	public static int recurrenceSearch(int A[],int left,int right,int a){
		int index=-1;
		if(left>right){
			return -1;
		}	
		int mid=(left+right)/2;
		if(A[mid]==a){	
			return mid;		
		}else if(a<A[mid]){
			index=recurrenceSearch(A, left, mid-1, a);
		}else{
			index=recurrenceSearch(A, mid+1,right, a);
		}		
		return index;
	}
	
	
	
public static void main(String[] args) {
	int A[]={1,2,3,4,5,6,7,8,9};
	System.out.println(binarySearch(A,0));
	System.out.println(binarySearch(A,1));
	System.out.println(binarySearch(A,9));
	int B[]={1,2,3,4,5,6,7,8,9};
	System.out.println(recurrenceSearch(B, 0, B.length-1, 8));
	
}
}
