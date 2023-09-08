package ArrayNewton;

public class InsertInUnsorted {
    static void insertElement(int array[], int n, int x,
                              int pos)
    {
        for (int i = n - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = x;
    }
    public static void main(String[] args)
    {
        int array[] = new int[15];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 4;

//        System.out.println(array.length);

        int n = 5;
        int x =9, pos = 3;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

        insertElement(array, n, x, pos);
        //in insertfunction n become n-1
//        so we need to add n=n+1
        // Or we can iuse i<=n in After Insertion Loop
        n += 1;

        System.out.print("\n\nAfter Insertion: ");
        for (int i = 0; i <n; i++)
            System.out.print(array[i] + " ");

    }
}
