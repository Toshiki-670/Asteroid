package lib;

public class Sort {
    //Quick Sort
    public static void quickSort(int[] args , int left, int right){
        if(left < right){
            int i = left, j = right;
            int temp, pivot = args[i + (j - i) / 2];
            while(true){
                while(args[i] < pivot)i++;
                while(pivot < args[j])j--;
                if(i >= j)break;
                temp = args[i];
                args[i] = args[j];
                args[j] = temp;
                i++;j--;
            }
            quickSort(args, left, i -1);
            quickSort(args, j + 1, right);
        }
    }
}
