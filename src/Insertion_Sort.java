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
			d = Math.random() * 10000; // random()함수는 0이상 1미만의 소수들을 리턴한다. 그니까 10000을 곱하면 0에서 9999까지가 되겠지
			x = (int)(Math.round(d)); // 소수 반올림해주고.
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