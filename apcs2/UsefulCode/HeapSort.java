public class HeapSort {

    public static void swap(int ind1, int ind2, int[] arr) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void printArr( int[] a ) {
        for ( int o : a )
            System.out.print( o + " " );
        System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
        int tmp;
        int swapPos;
        for( int i = 0; i < d.length; i++ ) {
            tmp = d[i];
            swapPos = i + (int)( (d.length - i) * Math.random() );
            swap( i, swapPos, d );
        }
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
        int[] retArr = new int[s];
        for( int i = 0; i < retArr.length; i++ )
            retArr[i] = (int)( maxVal * Math.random() );
        return retArr;
    }
    
    public static void heapSort(int[] arr) {
        ALHeap heap = new ALHeap();
        for (int i = 0 ; i < arr.length ; i++) {
            heap.add(arr[i]);
        }
        for (int j = 0 ; j < arr.length ; j++) {
            arr[j] = heap.removeMin();
        }
    }

    public static void main(String[] args) {
        int[] test = buildArray(15, 50);
        shuffle(test);
        System.out.println("Pre sort...");
        printArr(test);
        System.out.println("Sorting...");
        heapSort(test);
        System.out.println("Printing sorted...");
        printArr(test);
    }
    
}
