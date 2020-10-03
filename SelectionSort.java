
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNext()) {
			n = sc.nextInt();
		}
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int min = i ;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
