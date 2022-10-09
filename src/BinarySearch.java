public class BinarySearch implements Search{
    int[] array;

    public BinarySearch(){
        this.array = new int[50_000_000];
        for (int i=1; i<50_000_000; i++) this.array[i] = i;
    }
    @Override
    public boolean search(int target){
        return binarySearch(target, 0, array.length - 1);
    }

    private boolean binarySearch(int target, int low, int high) {
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return true;
            else if (target > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
