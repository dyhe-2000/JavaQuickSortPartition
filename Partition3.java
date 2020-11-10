public static void swap(String[] array, int i1, int i2) {
		String temp = array[i1];
	    array[i1] = array[i2];
	    array[i2] = temp;
	}
	public int partition(String[] array, int low, int high) {
		if(low == high){
			return low;
		}
		int pivotIndex = (high - 1 - low)/2 + low;
		swap(array, high - 1, pivotIndex);
		pivotIndex = high - 1;
		String pivot = array[pivotIndex];
		int smallerBeforeIndex = low;
		int largerAfterIndex = high - 2;
		while(largerAfterIndex >= smallerBeforeIndex) {
			if(array[smallerBeforeIndex].compareTo(pivot) > 0) {
				swap(array, smallerBeforeIndex, largerAfterIndex);
		        largerAfterIndex -= 1;
		    }
		    else {
		        smallerBeforeIndex += 1;
		    }
		}
		    
		if(array[smallerBeforeIndex].compareTo(pivot) < 0){
		   	swap(array, smallerBeforeIndex + 1, pivotIndex);
		   	return smallerBeforeIndex + 1;
		}
		else{
		   	swap(array, smallerBeforeIndex, pivotIndex);
		   	return smallerBeforeIndex;
		}
	}