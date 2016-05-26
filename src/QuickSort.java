
public class QuickSort {
	public static void quickSort(int [] arr, int p, int r){
		if(p < r){
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}		
	}
	
	public static int partition(int [] arr, int p, int r){
		int pivot = arr[r]; // 배열의 제일 마지막을 pivot으로 잡은거지.
		int pivotPosition = p - 1 ; // 배열의 제일 앞보다도 하나 전을 저 피벗 값이 위치할 장소의 인덱스로 두고.
		for(int j = p; j <= r - 1; j++){ // 주어진 배열의 제일 왼쪽부터 쭉 탐색할 거임.
			if(arr[j] <= pivot){ // pivot보다 작은 애를 찾아.
				pivotPosition++;
				swap(arr, pivotPosition, j); // 그 작은 애랑, 배열의 앞부분이랑 바꿔.(그럼 피벗 보다 작은애는 배열의 앞쪽에 들어감)
			}			
		}
		swap(arr, pivotPosition + 1, r); // 피벗보다 작은애들의 다음 인덱스에 피벗이 오면 딱 맞을테니, 피벗을 이제 일로 옮겨.
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
			d = Math.random() * 10000; // random()함수는 0이상 1미만의 소수들을 리턴한다. 그니까 10000을 곱하면 0에서 9999까지가 되겠지
			x = (int)(Math.round(d)); // 소수 반올림해주고.
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
