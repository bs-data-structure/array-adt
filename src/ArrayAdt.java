public class ArrayAdt {

    private int[] array;
    private int size; // no. of element present at moment
    private final int capacity; // max capacity of array

    ArrayAdt(int capacity){
        this.capacity = capacity;
    }

    void display(){
        for (int i = 0; i < size; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    void insert(int element) throws ArrayAdtException {
        if(size == capacity){
            throw new ArrayAdtException("Array Limit Reached");
        }

        array[size - 1] = element;
        size++;
    }

    void insert(int index, int element) throws ArrayAdtException {
        if(size == capacity){
            throw new ArrayAdtException("Array Limit Reached");
        }

        for (int i = size - 1; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    int get(int index) throws ArrayAdtException{
        if(index >= size){
            throw new ArrayAdtException("Cannot get out of range exception");
        }
        return array[index];
    }

    void delete(int index){
        
    }

}
