
public class QuickSort {
	public static void quickSort(int [] arr, int p, int r){
		if(p < r){
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}		
	}
	
	public static int partition(int [] arr, int p, int r){
		int pivot = arr[r]; // �迭�� ���� �������� pivot���� ��������.
		int pivotPosition = p - 1 ; // �迭�� ���� �պ��ٵ� �ϳ� ���� �� �ǹ� ���� ��ġ�� ����� �ε����� �ΰ�.
		for(int j = p; j <= r - 1; j++){ // �־��� �迭�� ���� ���ʺ��� �� Ž���� ����.
			if(arr[j] <= pivot){ // pivot���� ���� �ָ� ã��.
				pivotPosition++;
				swap(arr, pivotPosition, j); // �� ���� �ֶ�, �迭�� �պκ��̶� �ٲ�.(�׷� �ǹ� ���� �����ִ� �迭�� ���ʿ� ��)
			}			
		}
		swap(arr, pivotPosition + 1, r); // �ǹ����� �����ֵ��� ���� �ε����� �ǹ��� ���� �� �����״�, �ǹ��� ���� �Ϸ� �Ű�.
		return pivotPosition + 1;
	}
	
	public static void swap(int [] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[]){
		int [] arr = new int[100];
		double d; 
		int x;
		
		for(int i = 0; i < 100; i++){
			d = Math.random() * 10000; // random()�Լ��� 0�̻� 1�̸��� �Ҽ����� �����Ѵ�. �״ϱ� 10000�� ���ϸ� 0���� 9999������ �ǰ���
			x = (int)(Math.round(d)); // �Ҽ� �ݿø����ְ�.
			arr[i] = x;
		}
		
		quickSort(arr, 0, 99);
		for(int i = 0; i < 100; i++){
			System.out.print(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println();
		}
	}
}
