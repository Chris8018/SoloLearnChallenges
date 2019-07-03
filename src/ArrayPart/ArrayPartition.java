package ArrayPart;

import java.util.List;

public class ArrayPartition<N, E> {
    private final int N;
    private final List<Integer> E;

    private int d;
    private List<Integer> array1;
    private List<Integer> array2;

    public ArrayPartition(int N, List<Integer> E) {
        // TODO: validate value
        this.N = N;
        this.E = E;
        this.exe();
    }

    private void exe() {
        // TODO: run
    }

    public int getD() {
        return d;
    }

    public List<Integer> getArray1() {
        return array1;
    }

    public List<Integer> getArray2() {
        return array2;
    }
}
