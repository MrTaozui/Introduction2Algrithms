package insertion_sort;

import java.util.Arrays;

/**
 * 递归思想 插入排序
 * @author taojiajun
 *
 */
public class RecurrenceInsertionSort {
	/**
	 * A是排好序的数组 v是新来的数值
	 * 将v插入到合适的位置
	 * @param A
	 * @param v
	 */
public static void insert(int []A,int index){// 前0~index个已经排序好
	int v=A[index+1];//要插入的值为
	int i=index;
	while(i>=0&&v<A[i]){//找到v的位置
		A[i+1]=A[i];//后移动一位
		i--;
	}
	A[i+1]=v;
	
}
public static void RecurrenceInsertionSort(int A[],int n){//排序 对前0~index排序
	if(n>0){//当n=0则  已经排序完成
		RecurrenceInsertionSort(A,n-1);//对前下标0~n-1排序
		insert(A,n-1);//下标0~n-1个是已经排序好的 上面一行代码
	}else{
		return;
	}
}
public static void main(String[] args) {
	int A[]={1,2,3,4,5,1};
	insert(A,4);
	System.out.println(Arrays.toString(A));
	int B[]={7,1,3,1,6,8};
	RecurrenceInsertionSort(B,B.length-1);//
	System.out.println(Arrays.toString(B));
}

}
