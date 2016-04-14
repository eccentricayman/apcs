/*
  Ayman Ahmed
  APCS2 pd5
  HW#31 -- Fast Selection
  2016-04-13
*/

public class FastSelect {

    //swaps given array and two indexes
    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    //partitons around a pivot given a left and right to start from
    public static int partition(int[] arr, int pivotpos, int left, int right) {
        int pivotval = arr[pivotpos];
        swap(arr, pivotpos, right);
        int posctr = left;
        for (int i = left ; i < right - 1 ; i++) {
            if (arr[i] < pivotval) {
                swap(arr, posctr, i);
            }
            posctr++;
        }
        swap(arr, right, posctr);
        return posctr;
    }

    public static int Fsel(int[] arr, int k, int low, int high) {
        if (low >= high) {
            return arr[low];
        }
        else {
            int pos = (int)((Math.random()*(high - low))) + low;
            partition(arr, pos, low, high);
            if (pos == k) {
                return arr[k];
            }
            else {
                return Fsel(arr, k, low, high);
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {7, 3, 2, 1, 6};
        System.out.println(Fsel(x, 0, 0, x.length - 1));
    }
        
}
