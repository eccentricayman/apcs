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
        int posindex = left;
        for (int i = left ; i < right - 1 ; i++) {
            if (arr[i] < pivotval) {
                swap(arr, posindex, i);
            }
            posindex++;
        }
        swap(arr, right, posindex);
        return posindex;
    }

    public static int Fsel(int[] arr, int k, int low, int high) {
        if (low >= high) {
            return arr[low];
        }
        else {
            int range = (high - low) + 1;
            int pos = (int)(Math.random() * ((high - low) + 1)) + low;
            pos = partition(arr, pos, low, high);
            if (pos == k) {
                return arr[k];
            }
            else if (k < pos) {
                return Fsel(arr, k, low, high--);
            }
            else {
                return Fsel(arr, k, low++, high);
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {7, 3, 2, 1, 6};
        System.out.println(Fsel(x, 1, 0, x.length - 1));
    }
        
}
