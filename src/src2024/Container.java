package adventofcode.src2024;

// Change this according to data input
public class Container {
    private int[] array1;
    private int[] array2;

    public Container(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] getArray1() {
        return array1;
    }


    public int[] getArray2() {
        return array2;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }
}
