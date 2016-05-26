public class Insertion_Sort {
	public static void InsertionSort(int [] arr){
		int key;
		int i;
		for(int j = 1; j < arr.length; j++){
			key = arr[j];
			i = j - 1;
			while(i >= 0 && arr[i] > key){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
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
		
		InsertionSort(arr);
		for(int i = 0; i < 100; i++){
			System.out.print(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println();
		}
	}
}