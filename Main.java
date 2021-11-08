class Main{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 11, 2, 3, 1};
		secondLargestWithoutSort(arr);
	}

	static int pairs(int[] arr, int target){
		int first;
		int last;
		sort(arr);
		first = 0;
		last = arr.length-1;
		while(first != last){
			if(arr[first] + arr[last] == target){
				return arr[first] + arr[last];
			}else if(arr[first] + arr[last] < target){
				first++;
			}else{
				last--;
			}
		}

		return -1;
	}

	static boolean isUnique(int[] arr){
		int p1 = 0;
		int p2 = 1;
		sort(arr);
		while(p2 != arr.length){
			if(arr[p1] == arr[p2]){
				return false;
			}else{
				p1++;
				p2++;
			}
		}
		return true;
	}

	static void sort(int[] arr){
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i] < arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static int[][] rotate(int[][] arr){
		int[][] temp = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}

	static void longest(String[] arr){
		int temp = 0;
		int pos = 0;

		for(int i=0; i<arr.length; i++){
			if(arr[i].length()>temp){
				temp = arr[i].length();
				pos = i;
			}
		}

		System.out.println(arr[pos]);
	}

	static void wave(int[] arr){
		int temp;
		int i=0;
		int j=1;
		
		for(int k=0; k<arr.length/2; k++){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i += 2;
			j += 2;
		}
	}

	static void secondLargestWithoutSort(int[] arr){
		int first = arr[0];
		int second = 0;
		for(int i=0; i<arr.length; i++){
			if(first < arr[i]){
				second = first;
				first = arr[i];
			}
		}
		System.out.println(second);
	}
}