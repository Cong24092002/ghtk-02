import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai1 {
	public static List<Integer> XULIAM = new ArrayList();
	public static List<Integer> XULIDUONG = new ArrayList();
	public static void main(String[] args) {
		playWithArray();
		//playWithSet();
	}
	public static void sort(int a[],int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	public static void playWithArray() {
		int[] ds1 = {1,4,6,9,11,2,7,-8,3,8,1,-9,-8,3,2,-1,-1,4,-1,-5,-1,-5,5,5,5,4,0,4,3,6,7,6,5,10,11,6}; // nhap tu ban phim 
		int[] soAm = new int[10000];							
		int[] soDuong = new int[10000];
		int d = ds1.length;
		sort(ds1, d);
		int k = 0, t = 0;
		for(int i = 0; i < d; i++) {
			if(ds1[i] < 0) {
				soAm[k] = Math.abs(ds1[i]);
				k++;
			}
			else {
				soDuong[t] = ds1[i];
				t++;
			}
		}
		aBC(soAm, k, XULIAM);
		aBC(soDuong, t, XULIDUONG);
		for (Integer x : XULIAM) {
			System.out.print(x * (-1) + " ");
		}
		for (int x : XULIDUONG) {
			System.out.print(x + " ");
		}
	
	}
	
	// xu li index
	public static void aBC(int a[], int n, List b) {
		int[] kq = new int[10000];
		int[] check = new int[10000];
		for(int i = 0; i < 10000; i++ ) {
			check[i] = 0;
		}
		for(int i = 0; i < n; i++ ) {
			check[a[i]] ++;
		}
		int h = 0;
		for(int i = 0; i < n; i++ ) {
			if(check[a[i]] >= 1) {
				kq[h] = a[i];
				check[a[i]] = -1;
				h++;
			}
		}
	//	sort(kq,h);
		for(int i = 0; i < h; i++) {
			b.add(kq[i]);
		}
		
	}
	public static void playWithSet() {
		int[] ds1 = {1,4,6,9,11,2,7,3,8,1,-1,3,2,4,5,5,5,4,4,-5,3,6,7,6,5,10,11,6}; // nhap tu ban phim 
		Set<Integer> set = new HashSet<Integer>();
		int d = ds1.length;
		for(int i = 0; i < d; i++) {
			set.add(ds1[i]);
		}
		for (Integer x : set) {
			System.out.print(x + " ");
		}
		
	}

}
