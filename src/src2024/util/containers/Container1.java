package adventofcode.src2024.util.containers;

public class Container1 extends Container{
    private int[] array1;
    private int[] array2;

    public Container1(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] getArray1() {
        return array1;
    }


    public int[] getArray2() {
        return array2;
    }
}
