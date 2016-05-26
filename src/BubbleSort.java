
public class BubbleSort {
	public static void BubbleSort(int [] arr){
	        int size = arr.length;
	        for(int i=size-1; i>0; i--) {
	            for(int j=0; j<i; j++) {
	                if(arr[j] > arr[j+1]) {
	                    swap(arr,j,j+1);
	                }
	            }            
	        }
	        System.out.println();
	}
	 public static void swap(int[] arr, int index1, int index2) {
	        int temp = arr[index1];
	        arr[index1] = arr[index2];
	        arr[index2] = temp;
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
		
		BubbleSort(arr);
		for(int i = 0; i < 100; i++){
			System.out.print(arr[i] + " ");
			if(i % 10 == 0)
				System.out.println();
		}
	}
}
