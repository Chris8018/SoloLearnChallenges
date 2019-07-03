package ArrayPart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        E.sort(Comparator.reverseOrder()); // Descending order
        var temp1 = new ArrayList<Integer>();
        var temp2 = new ArrayList<Integer>();

        var i = 2;
        temp1.add(E.get(0));
        temp2.add(E.get(1));

        // If temp1 <= temp2 then add the current element to temp1 else temp2
        while (i < N) {
            if (temp1.stream().reduce(0, Integer::sum) <= temp2.stream().reduce(0, Integer::sum))
                temp1.add(E.get(i));
            else
                temp2.add(E.get(i));
            i++;
        }

        array1 = temp1;
        array2 = temp2;
        d = array1.stream().reduce(0, Integer::sum) - array2.stream().reduce(0, Integer::sum);

        if (d < 0)
            d = -d;
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
