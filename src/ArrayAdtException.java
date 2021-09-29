public class ArrayAdtException extends Exception {

    private final String detail;

    ArrayAdtException(String detail){
        this.detail = detail;
    }

    @Override
    public String toString(){
        return "ArraySizeOverflowException [" + detail + "]";
    }
}
