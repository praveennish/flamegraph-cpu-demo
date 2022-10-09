public class LinearSearch implements Search{
    int[] array;

    public LinearSearch(){
        this.array = new int[50_000_000];
        for (int i=1; i<50_000_000; i++) this.array[i] = i;
    }
    @Override
    public boolean search(int target){
        return linearSearch(target, 0, array.length - 1);
    }

    private boolean linearSearch(int target, int low, int high) {
        for(int i = low; i < high;i++){
            if(target == array[i])
                return true;
        }
        return false;
    }
}
