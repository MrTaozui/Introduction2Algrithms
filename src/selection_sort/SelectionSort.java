package selection_sort;


import java.util.Arrays;

/**
 * 选择排序
 * @author taojiajun
 *20180729
 */
public class SelectionSort {
	public static int[] selecttionSort(int[] A){
		int len=A.length-1;//长度
		int mindex;//A[i....len]最小值得索引
		int temp;//A[i....len]最小值
		for(int i=0;i<=len;i++){//生成A[i....len]
			mindex=i;//当前最小索引为第一个
			for(int j=i;j<=len;j++){	//从A[i...len]找到最小的	
			if(A[mindex]>A[j]){
				mindex=j;
			}
			}
			temp=A[mindex];//交换位置
			A[mindex]=A[i];
			A[i]=temp;
		}
		return A;
	}
	public static void main(String[] args) {
		int A[]={1,9,4,6,34,5,6,4,0,0,7,7,9,4,0,323};
		System.out.println(Arrays.toString(selecttionSort(A)));
		//result [0, 0, 0, 1, 4, 4, 4, 5, 6, 6, 7, 7, 9, 9, 34, 323]
	}

}
