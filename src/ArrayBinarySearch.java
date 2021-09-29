public class ArrayBinarySearch {

    private static int binarySearch(int[] arr, int l, int h, int key){
        while (l <= h){
            int mid = (l + h) / 2;
            if(key == arr[mid]){
                return mid;
            } else if (key < arr[mid]){
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int index =  binarySearch(arr, 0, arr.length - 1, 6);
        System.out.println(index);

    }
}
