package algorithm.order;
/**
 * 直接插入排序、希尔排序、冒泡排序、快速排序、直接选择排序、堆排序、归并排序、基数排序
 * @author renjw
 *
 */
public class Demo {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		
		a = a ^ b;
		System.out.println(a);
		b = a ^ b;
		a = a ^ b;
		System.out.println(a +"---------"+b);
	}
}
