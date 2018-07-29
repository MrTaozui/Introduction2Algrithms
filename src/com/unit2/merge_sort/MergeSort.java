package com.unit2.merge_sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author taojiajun
 *
 */
public class MergeSort {
	/**
	 * 归并排序的思想就是 分解成许多很小的问题，小问题得到解决后，合并成原来的问题得到解决
	 * @param A
	 * @param p
	 * @param r
	 */
	public  static  void mergeSort(int[] A,int p,int r){
		if(p<r){
			int q=(p+r)/2;//每次进来 都会进入到 子问题之中  从操作栈的角度考虑子问题执行完成栈帧出栈
			mergeSort(A,p,q);//然后执行栈顶的方法的栈帧，然后合并
			mergeSort(A,q+1,r);//从逻辑角度考虑 排序左边 排序右边 合并 问题得解
			merge(A, p, q, r);
		}else{
			//p>=r  说明就只有一个元素则一个元素则是排序好的  最小的子问题得解
		}
	}
/**
 * 对于A[p..q]与A[q+1...r]是排好序的  现在把它们合并
 * @param A
 * @param p
 * @param q
 * @param r
 */
	public static void merge(int A[], int p,int q,int r){
		int n1=q-p+1;//左边长度 +1包括q
		int n2=r-q;//右边长度 不包括q
		int L[]=new int[n1+1];
		int R[]=new int[n2+1];
		for(int i=0;i<=n1-1;i++){
			L[i]=A[p+i];
		}
		L[n1]=65535;//哨岗应该是无穷大
		for(int i=0;i<=n2-1;i++){
			R[i]=A[q+i+1];
		}
		R[n2]=65535;//哨岗应该是无穷大
		int j=0;
		int k=0;
		for(int i=p;i<=r;i++){//对L  R比较合并 重新写入A中
			if(L[j]<R[k]){//当前两个最小的 去比较 谁小谁放入A中
				A[i]=L[j];
				j++;
			}else{
				A[i]=R[k];
				k++;
			}
		}
	}
	public static void main(String[] args) {
		int B[]={1,2,7,2,3,4,9};
		merge(B, 0, 2, B.length-1);
		System.out.println(Arrays.toString(B));
		int[] A={1,5,32,8,4,8,56,5,43,45,453,23,7,35,7,4,0,2};
		mergeSort(A, 0, A.length-1);		
		System.out.println(Arrays.toString(A));
		
	}
}
