public class HeapSort {

    public static void main(String[] args) {
        int arr[] = { 6, 1, 4, 2, 7, 8, 5 };
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heapsort(int arr[]) {
        int n = arr.length;

        for (int i = (n / 2 - 1); i >= 0; i--) {
            heaphy(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heaphy(arr, i, 0);
        }
    }

    public static void heaphy(int arr[], int n, int i) {
        int index = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[index]) {
            index = l;
        }
        if (r < n && arr[r] > arr[index]) {
            index = r;
        }
        if (i != index) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            heaphy(arr, n, index);
        }
    }

}
