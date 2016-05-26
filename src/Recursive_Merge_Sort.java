public class Recursive_Merge_Sort {
	public static void Merge(int [] arr, int p, int q, int r){
		int leftSize = q - p + 1;
		int rightSize = r - q;
		
		int [] Left = new int[leftSize + 1]; // �� �� ���ϰ� �ϱ� ���� ���� ũ�⺸�� 1�� �� �ش�.
		int [] Right = new int[rightSize + 1];
		
		int i, j;
		for(i = 0; i < leftSize; i++)
			Left[i] = arr[p + i];
		for(j = 0; j < rightSize; j++)
			Right[j] = arr[q + j + 1];
		Left[leftSize] = Right[rightSize] = Integer.MAX_VALUE; // ���� �ϳ� �� �־��� �� ĭ��! ��Ƽ�� ���� �ִ´�.
		i = j = 0;
		for(int k = p; k < r + 1; k++){
			if(Left[i] <= Right[j]){
				arr[k] = Left[i];
				i++;
			}
			else{
				arr[k] = Right[j];
				j++;
			}
		}
	}
	
	public static void MergeSort(int [] arr, int p, int r){
		if(p < r){
			int q = (p+r)/2;
			MergeSort(arr, p, q);
			MergeSort(arr, q+1, r);
			Merge(arr, p, q, r);
		}
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
		
		MergeSort(arr, 0, 99);
		for(int i = 0; i < 100; i++){
			System.out.print(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println();
		}
	}
}
