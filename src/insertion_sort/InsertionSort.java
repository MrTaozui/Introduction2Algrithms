package insertion_sort;


import java.util.Arrays;

/**
 * 插入排序
 * @author taojiajun
 *20180729 0:33
 */
public class InsertionSort {
/**
 *
 * @param intArr
 * @return
 */
	public static int [] insertionSort(int intArr[]){
		for(int j=1;j<=intArr.length-1;j++){//第一位是已经比较好的
			int key=intArr[j];//key是将要插入的数字
			int i=j-1;//key的前一位 将要从这里开始比较，key开始找自己合适的位置
			while(i>=0&&key<intArr[i]){//开始  排序好的数组
				intArr[i+1]=intArr[i];//key<inArr[i] ,intArr[i]往后移动一个位置
				i=i-1;
			}
			intArr[i+1]=key;//因为第十行代码已经减去了一 所以加一
			
		}
		
		return intArr;
	}
	public static void main(String[] args) {
		int A[]={9,2,4,7,4,5,9,0,3,2,4,0,17};
		System.out.println(Arrays.toString(insertionSort(A)));
	}

}
