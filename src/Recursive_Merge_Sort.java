public class Recursive_Merge_Sort {
	public static void Merge(int [] arr, int p, int q, int r){
		int leftSize = q - p + 1;
		int rightSize = r - q;
		
		int [] Left = new int[leftSize + 1]; // 걍 비교 편하게 하기 위해 실제 크기보다 1을 더 준다.
		int [] Right = new int[rightSize + 1];
		
		int i, j;
		for(i = 0; i < leftSize; i++)
			Left[i] = arr[p + i];
		for(j = 0; j < rightSize; j++)
			Right[j] = arr[q + j + 1];
		Left[leftSize] = Right[rightSize] = Integer.MAX_VALUE; // 괜히 하나 더 넣어준 그 칸에! 센티널 값을 넣는다.
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
			d = Math.random() * 10000; // random()함수는 0이상 1미만의 소수들을 리턴한다. 그니까 10000을 곱하면 0에서 9999까지가 되겠지
			x = (int)(Math.round(d)); // 소수 반올림해주고.
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
