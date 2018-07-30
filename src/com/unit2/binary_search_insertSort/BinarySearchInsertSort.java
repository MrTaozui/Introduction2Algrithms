package com.unit2.binary_search_insertSort;

import java.util.Arrays;

/**
 * 二分法插入排序
 * @author taojiajun
 *
 */
public class BinarySearchInsertSort {
	
	/**
	 */
	public static int binarySerach(int []A,int l,int r,int v){	//不会找不到
		if(A[l]>v)
			return l;
		if(A[r]<v)
			return r;	
		int mid=(l+r)/2;
		if(A[mid]<v)
			if(v<A[mid+1])
				return mid;
			else
				return	binarySerach(A,mid+1, r,v);	//找到就返回给方法 
		else 
			if(A[mid-1]<v)
				return mid;
			else
				return binarySerach(A,l, mid-1,v);//找到就返回给方法	
	}
	/**
	 * FIXME  有错误 有时间需要纠正
	 * @param A
	 */
	public static void binarySerachSort(int A[]){
		for(int i=1;i<A.length;i++){
			int index= binarySerach(A,0,i-1,A[i]);
			int temp=A[index];
			A[index]=A[i];
			A[i]=temp;
		}
		
		
	}	
public static void main(String[] args) {
	int A[]={1,2,2,3,4,5,8,67,77};
	System.out.println(binarySerach(A,0,A.length-1,2));
	int B[]={9,7,1,3,5,6,8};
	binarySerachSort(B);
	System.out.println(Arrays.toString(B));
}
}
