class binarySearchInsertionSort {

    int binarySearch(int[] arr, int x) {
        int l = 0, b = arr.length - 1;
        while (l <= b ){
            int a = l + (b - l) / 2;
            if (arr[a] == x)
                return a;
            if (arr[a] < x)
                l = a + 1;
            else
                b = a - 1;
        }
        return -1;
    }

    static void InsertionSort(int[] arr, int size) {
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int c = i - 1;
            while (c >= 0 && arr[c] > key) {
                arr[c + 1] = arr[c];
                c = c - 1;
            }
            arr[c + 1] = key;
        }
    }

    static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        binarySearchInsertionSort ob = new binarySearchInsertionSort();
        int[] arr = { 9, 2, 4, 5, 7, 8 };
        int n = arr.length;

        System.out.print("Sebelum di sorting : ");
        printArray(arr, n);

        InsertionSort(arr, n);
        System.out.print("Sesudah di sorting : ");
        printArray(arr, n);

        int x = 5;
        System.out.println("\nMencari angka - " + x);
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Tidak ada angka " + x + " di array");
        else
            System.out.println("Angka " + x + " ada di index " + result);
    }
}
    

